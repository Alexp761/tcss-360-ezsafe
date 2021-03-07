package com.threesixty.ezsafe;

public class Keypad extends Device {
	private String armState;
	private String deviceID;
	private boolean deviceState;
	private boolean loginState;
	private int pin;
	
    public boolean acceptPIN(int pinInserted) {
    	if (this.pin == pinInserted) {
    		loginState = true;
    	}
		return loginState;
    }
    
    
    public String getArmedStatus() {
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
    	BaseStation.callEmergencyService(Service);
    }
}