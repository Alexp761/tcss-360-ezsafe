package com.threesixty.ezsafe;

public class Keypad {
	private String armState;
	private String deviceID;
	private boolean deviceState;
	private boolean loginState;
	
	
    public boolean acceptPIN(int pin) {
    }
    
    
    public boolean getArmedStatus() {
    	return this.armState; 
    }
    
    
    public void armStay() {
    	this.armState = "Stay";
    }
    
    public void armAway() {
    	this.armState = "Away";
    }
    
    public void disarm() {
    	this.armState = "Off";
    }
    
    public void requestEmergencyService(final String Service) {
    	
    }
}