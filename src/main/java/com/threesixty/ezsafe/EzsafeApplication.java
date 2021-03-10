package com.threesixty.ezsafe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.MouseInputListener;

import com.threesixty.ezsafe.Hazard.CarbonMonoxideDetector;
import com.threesixty.ezsafe.Hazard.SmokeDetector;
import com.threesixty.ezsafe.Hazard.WaterLeakSensor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EzsafeApplication {

	static BaseStation baseStation;

	private JFrame frmEzsafeApplication;
	private JLabel labelField;

	public static void main(String[] args) {
		baseStation = new BaseStation();

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					EzsafeApplication window = new EzsafeApplication();
					window.frmEzsafeApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EzsafeApplication() {

		initialize();

	}

	private void initialize() {
		frmEzsafeApplication = new JFrame();
		frmEzsafeApplication.getContentPane().setBackground(Color.GRAY);
		frmEzsafeApplication.setTitle("EzSafe Application\r\n");
		frmEzsafeApplication.setBounds(100, 100, 928, 800);
		frmEzsafeApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEzsafeApplication.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(461, 32, 461, 476);
		frmEzsafeApplication.getContentPane().add(panel);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int given1 = Integer.parseInt(btnNewButton.getText());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(21, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton);

		panel.setForeground(Color.BLACK);
		panel.setBounds(460, 11, 441, 453);
		frmEzsafeApplication.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblPlease = new JLabel("Enter Security PIN...\r\n");
		lblPlease.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPlease.setBounds(116, 95, 198, 76);
		panel.add(lblPlease);

		labelField = new JLabel();
		labelField.setBounds(116, 182, 208, 91);
		panel.add(labelField);

		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(111, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(201, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(21, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(111, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(201, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(21, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(111, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBounds(201, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_8);

		JButton btnAway = new JButton("AWAY");
		btnAway.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAway.setBounds(330, 25, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnAway);

		JButton btnArm = new JButton("ARM");
		btnArm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnArm.setBounds(330, 100, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnArm);

		JButton btnDisarm = new JButton("DISARM");
		btnDisarm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDisarm.setBounds(330, 173, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnDisarm);

		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.setBounds(21, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.setBounds(111, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("1");
		btnNewButton_14.setBounds(201, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNewButton_14);

		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHome.setBounds(330, 364, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnHome);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 476, 877, 278);
		frmEzsafeApplication.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Test Controller");
		lblNewLabel.setBounds(391, 5, 94, 16);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Select component: ");
		lblNewLabel_1.setBounds(6, 32, 137, 16);
		panel_1.add(lblNewLabel_1);

		JList componentList = new JList();
		componentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		componentList.setBounds(6, 56, 247, 216);
		JList devicesJList = new JList(baseStation.getSyncedDevices().toArray());
		ListModel devicesModel = devicesJList.getModel();
		componentList.setModel(devicesModel);
		
		panel_1.add(componentList);

		JRadioButton carboDetBtn = new JRadioButton("Carbon Monoxide Detector");
		carboDetBtn.setBounds(265, 84, 201, 23);
		carboDetBtn.setActionCommand("Carbon Monoxide Detector");
		panel_1.add(carboDetBtn);

		JRadioButton smokeDetBtn = new JRadioButton("Smoke Detector");
		smokeDetBtn.setBounds(265, 119, 201, 23);
		smokeDetBtn.setActionCommand("Smoke Detector");
		panel_1.add(smokeDetBtn);

		JRadioButton tempeSenBtn = new JRadioButton("Temperature Sensor");
		tempeSenBtn.setBounds(265, 154, 201, 23);
		tempeSenBtn.setActionCommand("Temperature Sensor");
		panel_1.add(tempeSenBtn);

		JRadioButton waterSenBtn = new JRadioButton("Water Leak Sensor");
		waterSenBtn.setBounds(265, 189, 201, 23);
		waterSenBtn.setActionCommand("Water Leak Sensor");
		panel_1.add(waterSenBtn);

		JRadioButton entrySenBtn = new JRadioButton("Entry Sensor");
		entrySenBtn.setBounds(478, 84, 168, 23);
		entrySenBtn.setActionCommand("Entry Sensor");
		panel_1.add(entrySenBtn);

		JRadioButton glassSenBtn = new JRadioButton("Glass Break Sensor");
		glassSenBtn.setBounds(478, 119, 168, 23);
		glassSenBtn.setActionCommand("Glass Break Sensor");
		panel_1.add(glassSenBtn);

		JRadioButton motioSenBtn = new JRadioButton("Motion Sensor");
		motioSenBtn.setBounds(478, 154, 168, 23);
		motioSenBtn.setActionCommand("Motion Sensor");
		panel_1.add(motioSenBtn);

		JRadioButton securCamBtn = new JRadioButton("Security Camera");
		securCamBtn.setBounds(478, 189, 168, 23);
		securCamBtn.setActionCommand("Security Camera");
		panel_1.add(securCamBtn);

		ButtonGroup newDeviceGroup = new ButtonGroup();
		newDeviceGroup.add(carboDetBtn);
		newDeviceGroup.add(smokeDetBtn);
		newDeviceGroup.add(tempeSenBtn);
		newDeviceGroup.add(waterSenBtn);
		newDeviceGroup.add(entrySenBtn);
		newDeviceGroup.add(glassSenBtn);
		newDeviceGroup.add(motioSenBtn);
		newDeviceGroup.add(securCamBtn);

		JLabel lblNewLabel_2 = new JLabel("Select new device to activate:");
		lblNewLabel_2.setBounds(265, 56, 220, 16);
		panel_1.add(lblNewLabel_2);

		JButton newDeviceBtn = new JButton("Activate Device");
		newDeviceBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String newDeviceString = newDeviceGroup.getSelection().getActionCommand();
				Device newDevice = createDevice(newDeviceString);
				BaseStation.activateDevice(newDevice);

				JList devicesJList = new JList(baseStation.getSyncedDevices().toArray());
				ListModel devicesModel = devicesJList.getModel();
				componentList.setModel(devicesModel);

			}
		});
		newDeviceBtn.setBounds(275, 224, 371, 29);
		panel_1.add(newDeviceBtn);
	}

	public Device createDevice(String newDeviceString) {
		switch (newDeviceString) {
		case "Carbon Monoxide Detector":
			return new CarbonMonoxideDetector(createID(), true, "Low", 0.0);

		case "Smoke Detector":
			return new SmokeDetector(createID(), true, 0.0, 0.0);

		case "Temperature Sensor":
			return new SmokeDetector(createID(), true, 0.0, 0.0);

		case "Water Leak Sensor":
			return new WaterLeakSensor(createID(), true);

		case "Entry Sensor":
			return new WaterLeakSensor(createID(), true);

		case "Glass Break Sensor":
			return new WaterLeakSensor(createID(), true);

		case "Motion Sensor":
			return new WaterLeakSensor(createID(), true);

		case "Security Camera":
			return new WaterLeakSensor(createID(), true);

		default:
			return new WaterLeakSensor(createID(), true);
		}
	}

	public String createID() {

		return "000000";
	}
}
