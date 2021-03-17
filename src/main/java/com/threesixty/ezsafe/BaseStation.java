package com.threesixty.ezsafe;

import java.util.ArrayList;
import java.util.List;

public class BaseStation {

	private final static List<Device> deviceList = new ArrayList<>();
	private int pin;
	private boolean wifiState;
	private String userID;
	private String armState;
	private String deviceID;
	private static String currentRequest;
	private static final String FIRE_DEPARTMENT = "Fire";
	private static final String POLICE = "Police";
	private static final String HOSPITAL = "Hospital";
	// Optional? Still Need data connect: object
	// Optional? Still Need powered: boolean

	public BaseStation() {
		/// default pin
		pin = 0000;
		userID = null;
		armState = "UNARMED";
		deviceID = "000001";
		wifiState = false;
	}

	public static void activateDevice(Device givenDevice) {
		deviceList.add(givenDevice);
	}

	// returns true if device found and deleted
	public static boolean deactivateDevice(Device givenDevice) {
		return deviceList.remove(givenDevice);
	}

	public List<Device> getSyncedDevices() {
		return deviceList;
	}

	public void changeArmState(String armState) {
		this.armState = armState;
	}

	public String getArmState() {
		return armState;
	}

	public static void callEmergencyService(String emergencyService) {
		if (emergencyService == "Fire") {
			currentRequest = FIRE_DEPARTMENT;
		} else if (emergencyService == "Police") {
			currentRequest = POLICE;
		} else if (emergencyService == "Hospital") {
			currentRequest = HOSPITAL;
		}
		// Call currentRequest
	}

	public void callControlCenter() {
		// Call Control Center
	}

}
