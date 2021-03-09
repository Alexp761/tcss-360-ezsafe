package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class GlassBreakSensor extends Device {
	
	private boolean glassBreakStatus;
	
	public GlassBreakSensor(final String ID,final boolean state) {
		super.deviceID = ID;
		super.deviceState =state;
		this.glassBreakStatus = false;

		}
	
	public boolean getGlassBreakStatus() {
		return glassBreakStatus;
	}
	
	public void changeGlassBreakStatus(boolean theStatus) {
		glassBreakStatus = theStatus;
	}

}