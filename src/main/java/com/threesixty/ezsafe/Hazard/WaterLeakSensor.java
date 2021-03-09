package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;

/**
 * WaterLeakSensor
 */
public class WaterLeakSensor extends Device {
    private boolean waterLeakDectected;

/**

 * @param ID
 * @param state
 */
public WaterLeakSensor(final String ID,final boolean state){
super.deviceID = ID;
super.deviceState =state;
this.waterLeakDectected = false;

}



public void setDetectionStatus(final boolean state){

this.waterLeakDectected = state;

}


public boolean getDectectionState(){

return this.waterLeakDectected;


}

}


