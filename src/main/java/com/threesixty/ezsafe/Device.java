package com.threesixty.ezsafe;

public abstract class Device {
    private String deviceID;
    private boolean deviceState;

    public String getDeviceID() {
        return deviceID;
    }

    public boolean isDeviceState() {
        return deviceState;
    }

    public void setDeviceState(boolean deviceState) {
        this.deviceState = deviceState;
    }

}
