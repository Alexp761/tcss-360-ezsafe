package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class EntrySensor extends Device {

	private boolean entryStatus;

	public EntrySensor(final String ID, final boolean state) {
		super.deviceID = ID;
		super.deviceState = state;
		this.entryStatus = false;

	}

	public boolean getEntryStatus() {
		return entryStatus;
	}

	public void changeEntryStatus(boolean theStatus) {
		entryStatus = theStatus;
	}

}
