package com.threesixty.ezsafe;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EzsafeApplication {
	
	private JFrame frmEzsafeApplication;
	private JLabel labelField;
	
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
		frmEzsafeApplication.getContentPane().setBackground(Color.GRAY);
		frmEzsafeApplication.setTitle("EzSafe Application\r\n");
		frmEzsafeApplication.setBounds(100, 100, 928, 549);
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
	}
}
