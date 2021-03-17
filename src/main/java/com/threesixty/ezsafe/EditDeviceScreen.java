package com.threesixty.ezsafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.threesixty.ezsafe.Burglary.EntrySensor;
import com.threesixty.ezsafe.Burglary.GlassBreakSensor;
import com.threesixty.ezsafe.Burglary.MotionSensor;
import com.threesixty.ezsafe.Burglary.SecurityCamera;
import com.threesixty.ezsafe.Hazard.CarbonMonoxideDetector;
import com.threesixty.ezsafe.Hazard.SmokeDetector;
import com.threesixty.ezsafe.Hazard.TemperatureSensor;
import com.threesixty.ezsafe.Hazard.WaterLeakSensor;

public class EditDeviceScreen extends JFrame {

	private JPanel contentPane;

	private final Class[] burglaryClasses = { EntrySensor.class, GlassBreakSensor.class, MotionSensor.class,
			SecurityCamera.class };
	private final Class[] hazardClasses = { CarbonMonoxideDetector.class, SmokeDetector.class, TemperatureSensor.class,
			WaterLeakSensor.class };

	/**
	 * Create the frame.
	 */
	public EditDeviceScreen(Device d) {
		if (d.getClass() == )
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public boolean isBurglarySensor(Device d) {
		for (Class c : burglaryClasses) {
			if (d.getClass() == c) {
				return true;
			}
		}
		return false;
	}

	public boolean isHazardSesnor(Device d) {
		for (Class c : hazardClasses) {
			if (d.getClass() == c) {
				return true;
			}
		}
		return false;
	}

}
