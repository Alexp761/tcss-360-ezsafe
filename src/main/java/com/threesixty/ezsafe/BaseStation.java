package com.threesixty.ezsafe;

import java.util.ArrayList;
import java.util.List;

public class BaseStation {
	
	private final List<Device> deviceList = new ArrayList<>();
	private int pin;
	private String userID;
	private String armState;
	private String deviceID;
	private boolean wifiState;
	// need data connect: object
	// need powered? boolean
	
	
    public BaseStation() {
    	/// default pin
    	pin = 0000;
    	userID = null;
    	armState = "UNARMED";
    	deviceID = "000001";
    	wifiState = false;
    }
    
    public void activateDevice(Device givenDevice) {
    	deviceList.add(givenDevice);
    }
    
    // returns true if device found and deleted
    public boolean deactivateDevice(Device givenDevice) {
    	return deviceList.remove(givenDevice);
    }
    
    public List<Device> getSyncedDevices() {
    	return deviceList;
    }
    
    public void changeArmState(String armState) {
    	this.armState = armState;
    }
    
    public void callEmergencyService(String emergencyService) {
    	// activate emergency service
    }
    
    public void callControlCenter() {
    	// activate control center
    
    }
    
}
