package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class GlassBreakSensor extends Device {
	
	private boolean glassBreakStatus;
	
	public boolean getGlassBreakStatus() {
		return glassBreakStatus;
	}
	
	public void changeGlassBreakStatus(boolean theStatus) {
		glassBreakStatus = theStatus;
	}

}