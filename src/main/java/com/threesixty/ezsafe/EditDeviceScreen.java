package com.threesixty.ezsafe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;

import com.threesixty.ezsafe.Burglary.EntrySensor;
import com.threesixty.ezsafe.Burglary.GlassBreakSensor;
import com.threesixty.ezsafe.Burglary.MotionSensor;
import com.threesixty.ezsafe.Burglary.SecurityCamera;
import com.threesixty.ezsafe.Hazard.CarbonMonoxideDetector;
import com.threesixty.ezsafe.Hazard.SmokeDetector;
import com.threesixty.ezsafe.Hazard.TemperatureSensor;
import com.threesixty.ezsafe.Hazard.WaterLeakSensor;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

public class EditDeviceScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private static final Class[] burglaryClasses = { EntrySensor.class, GlassBreakSensor.class, MotionSensor.class,
			SecurityCamera.class };
	private static final Class[] hazardClasses = { CarbonMonoxideDetector.class, SmokeDetector.class,
			TemperatureSensor.class, WaterLeakSensor.class };
	private JTextField hazardField;

	/**
	 * Create the dialog.
	 */
	public EditDeviceScreen(Device selectedDevice) {
		setBounds(100, 100, 450, 300);
		setMinimumSize(new Dimension(450, 300));

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		// Edit Device Content
		JLabel deviceStateLabel = new JLabel("Power Status");
		deviceStateLabel.setBounds(6, 68, 89, 16);
		contentPanel.add(deviceStateLabel);

		JToggleButton onOffToggle = new JToggleButton(selectedDevice.isDeviceState() ? "On" : "Off");
		onOffToggle.setSelected(selectedDevice.isDeviceState());
		onOffToggle.addMouseListener(new MouseInputAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedDevice.setDeviceState(onOffToggle.isSelected());
				onOffToggle.setText(onOffToggle.isSelected() ? "On" : "Off");
			}
		});
		onOffToggle.setSelected(true);
		onOffToggle.setBounds(107, 63, 124, 29);
		contentPanel.add(onOffToggle);

		JLabel deviceLabel = new JLabel("Editing");
		deviceLabel.setText("Editing " + selectedDevice.getClass().getSimpleName());
		deviceLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		deviceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deviceLabel.setBounds(6, 6, 438, 17);
		contentPanel.add(deviceLabel);

		JLabel triggerLabel = new JLabel("Triggered");
		triggerLabel.setBounds(6, 130, 61, 16);
		contentPanel.add(triggerLabel);

		JLabel triggeredStateLbl = new JLabel("No");
		triggeredStateLbl.setForeground(Color.GRAY);
		triggeredStateLbl.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		triggeredStateLbl.setBackground(Color.WHITE);
		triggeredStateLbl.setHorizontalAlignment(SwingConstants.CENTER);
		triggeredStateLbl.setBounds(107, 130, 124, 16);
		contentPanel.add(triggeredStateLbl);

		JLabel deviceIDTextLbl = new JLabel("Device ID");
		deviceIDTextLbl.setBounds(6, 35, 61, 16);
		contentPanel.add(deviceIDTextLbl);

		JLabel deviceIDLbl = new JLabel(selectedDevice.getDeviceID());
		deviceIDLbl.setHorizontalAlignment(SwingConstants.CENTER);
		deviceIDLbl.setForeground(Color.GRAY);
		deviceIDLbl.setFont(new Font("Courier New", Font.ITALIC, 13));
		deviceIDLbl.setBackground(Color.WHITE);
		deviceIDLbl.setBounds(107, 35, 124, 16);
		contentPanel.add(deviceIDLbl);

		// levels for hazards (temp, co, smoke)
		if (!(isBurglarySensor(selectedDevice)
				|| selectedDevice.getClass().getSimpleName().equals("WaterLeakSensor"))) {
			JLabel hazardLbl = new JLabel("Hazard Level");
			hazardLbl.setBounds(6, 95, 89, 16);

			contentPanel.add(hazardLbl);

			hazardField = new JTextField();
			hazardField.setHorizontalAlignment(SwingConstants.RIGHT);
			hazardField.setText("Enter number here");
			hazardField.setBounds(107, 90, 124, 26);
			contentPanel.add(hazardField);
			hazardField.setColumns(10);

			JButton updateHazardBtn = new JButton("Update and Close");
			updateHazardBtn.setBounds(243, 90, 78, 29);
			updateHazardBtn.addMouseListener(new MouseInputAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String inputText = hazardField.getText();

					try {
						double inputNum = Double.parseDouble(inputText);
						switch (selectedDevice.getClass().getSimpleName()) {
						case "SmokeDetector":
							((SmokeDetector) selectedDevice).changeParticeDensity(inputNum);
							((SmokeDetector) selectedDevice).getSmokeLevel();
							break;
						case "TemperatureSensor":
							((TemperatureSensor) selectedDevice).changeTemp(inputNum);
							((TemperatureSensor) selectedDevice).changeTempLevel(inputNum);
							break;
						case "CarbonMonoxideDetector":
							((CarbonMonoxideDetector) selectedDevice).changeCMPartile(inputNum);
							break;
						default:
							JOptionPane.showMessageDialog(new JFrame(), "Unexpected error. Did not update.");
							break;
						}
					} catch (NumberFormatException exc) {
						JOptionPane.showMessageDialog(new JFrame(), "Invalid Hazard Level Input.");
					}
				}
			});
			contentPanel.add(updateHazardBtn);
		}

		// Edit Ok/Cancel Buttons
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);

			{
				JButton closeButton = new JButton("Close");
				closeButton.setActionCommand("Close");
				closeButton.addMouseListener(new MouseInputAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();

					}
				});
				buttonPane.add(closeButton);
			}
		}
		pack();
	}

	public boolean isBurglarySensor(Device d) {

		for (Class c : burglaryClasses) {
			if (d.getClass() == c) {
				return true;
			}
		}
		return false;
	}

	public boolean isHazardSensor(Device d) {
		for (Class c : hazardClasses) {
			if (d.getClass() == c) {
				return true;
			}
		}
		return false;
	}
}