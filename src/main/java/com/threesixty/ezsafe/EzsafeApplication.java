package com.threesixty.ezsafe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import javax.swing.ImageIcon;

import javax.swing.ButtonGroup;

import javax.swing.JList;

import javax.swing.JRadioButton;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import com.threesixty.ezsafe.Hazard.CarbonMonoxideDetector;
import com.threesixty.ezsafe.Hazard.SmokeDetector;
import com.threesixty.ezsafe.Hazard.WaterLeakSensor;

public class EzsafeApplication {

	static BaseStation baseStation;

	private JFrame frmEzsafeApplication;
	private JLabel labelField;

	private JTextField value1;
	private boolean pinCheck = false;
	private int pin = 0000;

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
		frmEzsafeApplication.getContentPane().setBackground(new Color(51, 51, 51));
		frmEzsafeApplication.setTitle("EzSafe Application\r\n");
		frmEzsafeApplication.setBounds(100, 100, 928, 800);
		frmEzsafeApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEzsafeApplication.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(440, 11, 461, 476);
		frmEzsafeApplication.getContentPane().add(panel);

		panel.setForeground(Color.BLACK);
		panel.setBounds(460, 11, 441, 453);
		frmEzsafeApplication.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblPlease = new JLabel("Enter Security PIN...\r\n");
		lblPlease.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPlease.setBounds(116, 95, 198, 76);
		panel.add(lblPlease);

		value1 = new JTextField();
		value1.setFont(new Font("Tahoma", Font.PLAIN, 67));
		value1.setForeground(Color.BLACK);
		value1.setBackground(Color.WHITE);
		value1.setBounds(137, 167, 155, 100);
		panel.add(value1);
		value1.setColumns(10);

		JLabel lblNewLabel = new JLabel(" 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setBounds(10, 11, 39, 37);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(46, 11, 39, 37);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setBounds(75, 11, 39, 37);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("4");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_4.setBackground(Color.RED);
		lblNewLabel_4.setBounds(102, 11, 39, 37);
		panel.add(lblNewLabel_4);

		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblHome.setBounds(374, -14, 57, 62);
		panel.add(lblHome);
		lblHome.setVisible(false);

		JLabel lblAlert = new JLabel();
		lblAlert.setVerticalAlignment(SwingConstants.TOP);
		lblAlert.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAlert.setBounds(32, 95, 383, 253);
		panel.add(lblAlert);
		lblAlert.setVisible(false);

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 1);
			}
		});

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 0);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(111, 250, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn0);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(21, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(111, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(201, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(21, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(111, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(201, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(21, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(111, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText() + 9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(201, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn9);

		JButton btnAway = new JButton("AWAY");
		btnAway.setBackground(new Color(255, 255, 255));
		btnAway.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAway.setBounds(330, 25, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnAway);

		JButton btnArm = new JButton("ARM");
		btnArm.setBackground(new Color(255, 255, 255));
		btnArm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnArm.setBounds(330, 100, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnArm);

		JButton btnDisarm = new JButton("DISARM");
		btnDisarm.setBackground(new Color(255, 255, 255));
		btnDisarm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDisarm.setBounds(330, 173, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnDisarm);

		ImageIcon icon1 = new ImageIcon(
				new ImageIcon("fire.png").getImage().getScaledInstance(80, 70, Image.SCALE_DEFAULT));
		JButton btnFire = new JButton(icon1);
		btnFire.setBackground(new Color(255, 255, 255));
		btnFire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pinCheck == false) {
					JOptionPane.showMessageDialog(new JFrame(), "You must log in first!");
					value1.setText(null);
				} else {
					lblNewLabel_4.setForeground(Color.GREEN);
					lblNewLabel_2.setForeground(Color.RED);
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel.setForeground(Color.RED);
					lblHome.setVisible(false);
					lblAlert.setText(
							"<html><p>Fire Detected.\nLocal Fire Departments have been alerted and are en route to your location.</p></html>");
					lblAlert.setVisible(true);
				}
			}
		});
		btnFire.setBounds(21, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnFire);

		ImageIcon icon2 = new ImageIcon(
				new ImageIcon("police.png").getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT));
		JButton btnPolice = new JButton(icon2);
		btnPolice.setBackground(new Color(255, 255, 255));
		btnPolice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pinCheck == false) {
					JOptionPane.showMessageDialog(new JFrame(), "You must log in first!");
					value1.setText(null);
				} else {
					lblNewLabel_4.setForeground(Color.GREEN);
					lblNewLabel_2.setForeground(Color.RED);
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel.setForeground(Color.RED);
					lblHome.setVisible(false);
					lblAlert.setText(
							"<html><p>Break-in detected.\n Police have been alerted and are en route to your location.</p></html>");
					lblAlert.setVisible(true);
				}
			}
		});
		btnPolice.setBounds(111, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnPolice);

		ImageIcon icon3 = new ImageIcon(
				new ImageIcon("hospital.png").getImage().getScaledInstance(65, 65, Image.SCALE_DEFAULT));
		JButton btnHospital = new JButton(icon3);
		btnHospital.setBackground(new Color(255, 255, 255));
		btnHospital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pinCheck == false) {
					JOptionPane.showMessageDialog(new JFrame(), "You must log in first!");
					value1.setText(null);
				} else {
					lblNewLabel_4.setForeground(Color.GREEN);
					lblNewLabel_2.setForeground(Color.RED);
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel.setForeground(Color.RED);
					lblHome.setVisible(false);
					lblAlert.setText(
							"<html><p>Medical Emergency Detected. \nEmergency Dispatch has been alerted and are en route to your location.</p></html>");
					lblAlert.setVisible(true);
				}
			}
		});
		btnHospital.setBounds(201, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnHospital);

		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pinCheck == false) {
					JOptionPane.showMessageDialog(new JFrame(), "You must log in first!");
					value1.setText(null);
				} else {
					value1.setText(null);
					value1.setVisible(false);
					lblPlease.setVisible(false);
					lblNewLabel_4.setForeground(Color.RED);
					lblNewLabel_2.setForeground(Color.RED);
					lblNewLabel_1.setForeground(Color.GREEN);
					lblNewLabel.setForeground(Color.RED);
					lblHome.setVisible(true);
					lblAlert.setVisible(false);
				}
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHome.setBounds(330, 364, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnHome);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 476, 877, 278);
		frmEzsafeApplication.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel testControlLabel = new JLabel("Test Controller");
		testControlLabel.setBounds(391, 5, 94, 16);
		panel_1.add(testControlLabel);

		JLabel selectComponentLabel = new JLabel("Select component: ");
		selectComponentLabel.setBounds(6, 32, 137, 16);
		panel_1.add(selectComponentLabel);

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

		JLabel activateLabel = new JLabel("Select new device to activate:");
		activateLabel.setBounds(265, 56, 220, 16);
		panel_1.add(activateLabel);

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
