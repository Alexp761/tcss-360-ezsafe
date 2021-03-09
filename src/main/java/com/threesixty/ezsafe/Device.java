package com.threesixty.ezsafe;

public abstract class Device {
    protected String deviceID;
    protected boolean deviceState;

    public String getDeviceID() {
        return this.deviceID;
    }

    public boolean isDeviceState() {
        return this.deviceState;
    }

    public void setDeviceState(final boolean deviceState) {
        this.deviceState = deviceState;
    }

}
