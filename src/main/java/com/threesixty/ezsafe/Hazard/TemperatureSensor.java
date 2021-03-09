package com.threesixty.ezsafe.Hazard;


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
	private final float normal; 
	private final float low;
	private float Dangerous;
	
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