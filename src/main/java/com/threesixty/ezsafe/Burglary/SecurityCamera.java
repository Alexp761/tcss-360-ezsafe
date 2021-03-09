package com.threesixty.ezsafe.Burglary;

import com.threesixty.ezsafe.Device;

public class SecurityCamera extends Device {

	private boolean lightStatus;
	
	private Object recording;
	
	private Object liveFeed;
	
	public void setLights(boolean theSetting) {
		lightStatus = theSetting;
	}
	
	public void record() {
		
	}
	
	public Object getRecording() {
		return recording;
	}
	
	public Object getLiveFeed() {
		return liveFeed;
	}
	
}
