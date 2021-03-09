package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class EntrySensor extends Device {

	private boolean entryStatus; 
	
	
	public boolean getEntryStatus() {
		return entryStatus;
	}
	
	public void changeEntryStatus(boolean theStatus) {
		entryStatus = theStatus;
	}
	
}
