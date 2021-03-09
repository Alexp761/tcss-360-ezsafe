package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class MotionSensor extends Device {

private boolean motionStatus;
	
	
	public boolean getMotionStatus() {
		return motionStatus;
	}
	
	public void changeMotionStatus(boolean theStatus) {
		motionStatus = theStatus;
	}
	
}