package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

import java.awt.BorderLayout;
//import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; 

public class SecurityCamera extends Device {

	private boolean lightStatus;
	
	private BufferedImage recording;
	
	
	public SecurityCamera(final String ID,final boolean state) {
		super.deviceID = ID;
		super.deviceState =state;
		this.lightStatus = false;

		}
	
	public void setLights(boolean theSetting) {
		lightStatus = theSetting;
	}
	
	public void record(BufferedImage theRecording) {
		lightStatus = true;
		recording = theRecording;
		
	}
	
	public BufferedImage getRecording() {
		return recording;
	}
	
	
	public boolean getlightStatus() {
		return lightStatus;
	}
	
	
	
	
	//Testing:
	
	public static void main(String args[]) {
		SecurityCamera cam = new SecurityCamera("123", true);
		
		BufferedImage returning;
        try {
            returning = ImageIO.read(new File("/Users/drewwhite/Desktop/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
            returning = null; }
		
		cam.record(returning);
        //System.out.println();
        //System.out.println(cam.getRecording());
        
//        Graphic g = new Graphics();
//        g.drawImage(cam.getRecording(), 0, 0, null);
        
        
        JFrame img = new JFrame();
        
        ImageIcon imageIcon = new ImageIcon(cam.getRecording());
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        img.getContentPane().add(jLabel, BorderLayout.CENTER);

        img.pack();
        img.setLocationRelativeTo(null);
        img.setVisible(true);
        
    }
	
}