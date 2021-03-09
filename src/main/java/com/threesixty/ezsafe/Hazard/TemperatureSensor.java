package com.threesixty.ezsafe.Hazard;

// be able to set temprature of the house 
// set the temprature of separte rooms 
// classify the temprature level 
// refering room temprature e clasify them confortable between 66.0 and 77.0 degree F 
// below 66.0 ww will name it as cold
// above 77.0 we will name it as warm. 

// 

//
//Attributes:

//DeviceID:String
//Temperature:Float
//On/Off:Boolean
//TemperatureLevel:String

//Methods:

//getDeviceID():String
//getDeviceState:Boolean
//getTempLevel()::String

//turnOnOff()

//changeTempLevel(Temperature) 
//changeTemp(Degree)    
//    (Temperature level: Low and dangerous)

public class TemperatureSensor extends Device {
	private final float normalTemp; 
	private final float belowNormal;
	private float aboveNormal;
	
     private final String normal= "Normal ";
     private final String Dangerous = "Dangerous";
     private final String  low= "lowl";
     
     private   float Temp;
     private  String templLevel;
     
     public TemperatureSensor(String ID, Boolean state, float Temp, String tempLevel)
}
		super.deviceID = ID;
		super.deviceState = state; 
		this.Temp=Temp;
		this.tempLevel=tempLevel;
		changeTempLevel(Temp,tempLevel);
	}

public  String getTempLevel() {
	changeTempLevel(this.Temp, this.templLevel)
	return this.templLevelemp;
}

private void changeTempLevel(int Temp) {
	if(Temp>=41.0 $$ Temp <=300.0)
		this.templLevel=normal;
	
} if else (Temp >=300.0) {
	this.templLevel=Dangerous;
}
else {
	this.templLevel= low;
}