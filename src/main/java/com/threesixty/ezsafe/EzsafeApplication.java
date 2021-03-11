package com.threesixty.ezsafe;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EzsafeApplication {
	
	private JFrame frmEzsafeApplication;
	private JTextField value1;
	private boolean pinCheck = false;
	private int pin = 0000;
	
	public static void main(String[] args) {
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
		frmEzsafeApplication.setBounds(100, 100, 928, 549);
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
		
		JLabel lblNewLabel_2_1 = new JLabel("4");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1.setBackground(Color.RED);
		lblNewLabel_2_1.setBounds(102, 11, 39, 37);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblHome.setBounds(374, -14, 57, 62);
		panel.add(lblHome);
		lblHome.setVisible(false);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+1);
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+0);
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
				value1.setText(value1.getText()+2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(111, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(201, 25, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(21, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(111, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(201, 100, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(21, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(111, 175, 80, 64);
		frmEzsafeApplication.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+9);
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
		
		ImageIcon icon1 = new ImageIcon(new ImageIcon("fire.png").getImage().getScaledInstance(80,70, Image.SCALE_DEFAULT));
		JButton btnFire = new JButton(icon1);
		btnFire.setBackground(new Color(255, 255, 255));
		btnFire.setBounds(21, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnFire);
		
		ImageIcon icon2 = new ImageIcon(new ImageIcon("police.png").getImage().getScaledInstance(80,60, Image.SCALE_DEFAULT));
		JButton btnPolice = new JButton(icon2);
		btnPolice.setBackground(new Color(255, 255, 255));
		btnPolice.setBounds(111, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnPolice);
		
		ImageIcon icon3 = new ImageIcon(new ImageIcon("hospital.png").getImage().getScaledInstance(65,65, Image.SCALE_DEFAULT));
		JButton btnHospital = new JButton(icon3);
		btnHospital.setBackground(new Color(255, 255, 255));
		btnHospital.setBounds(201, 364, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnHospital);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHome.setBounds(330, 364, 100, 64);
		frmEzsafeApplication.getContentPane().add(btnHome);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBackground(new Color(255, 255, 255));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pinCheck == false && !value1.getText().equals("")) {
					if ((Integer.parseInt(value1.getText()) == pin) && value1.getDocument().getLength() == 4) {
						pinCheck = true;
						value1.setText(null);
						value1.setVisible(false);
						lblPlease.setVisible(false);
						lblNewLabel_1.setForeground(Color.GREEN);
						lblNewLabel.setForeground(Color.RED);
						lblHome.setVisible(true);
						
					} else {
						JOptionPane.showMessageDialog(new JFrame(), "Invalid Credentials.");
						value1.setText(null);
					}
				}
			}
		});
		
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEnter.setBounds(201, 250, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnEnter);
		
		JButton btnNothing = new JButton("...");
		btnNothing.setBackground(new Color(255, 255, 255));
		btnNothing.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNothing.setBounds(21, 250, 80, 64);
		frmEzsafeApplication.getContentPane().add(btnNothing);
		
	}
}
