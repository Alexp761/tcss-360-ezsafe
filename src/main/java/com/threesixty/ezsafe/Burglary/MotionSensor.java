package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class MotionSensor extends Device {

private boolean motionStatus;

	public MotionSensor(final String ID,final boolean state) {
		super.deviceID = ID;
		super.deviceState =state;
		this.motionStatus = false;

	}
	
	public boolean getMotionStatus() {
		return motionStatus;
	}
	
	public void changeMotionStatus(boolean theStatus) {
		motionStatus = theStatus;
	}
	
}