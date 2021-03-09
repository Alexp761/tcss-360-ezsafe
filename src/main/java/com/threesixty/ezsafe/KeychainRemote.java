package com.threesixty.ezsafe;

public class KeychainRemote extends Device {
	private String armState;
	private String deviceID;
	private int pin;
	
	public void activateDevice(final Device givenDevice) {
		BaseStation.activateDevice(givenDevice);
	}
	
	public void deactivateDevice(final Device givenDevice) {
		BaseStation.deactivateDevice(givenDevice);
	}
	
    public void changeArmedState(final String newArmedState) {
    	this.armState = newArmedState;
    }
	
    public void panicButton(final String requestedHelp) {
    	BaseStation.callEmergencyService(requestedHelp);
    }
}