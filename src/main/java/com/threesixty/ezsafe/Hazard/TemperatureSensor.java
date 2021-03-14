package com.threesixty.ezsafe.Hazard;

// published by Michael Tademu
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
	private final float normal=41; 
	private final float low=40;
	private float Dangerous=300;
	
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
		
	}

public  String getTempLevel() {
	return this.templLevelemp;
}

private void changeTempLevel(int Temp) {
	if(Temp>=41.0 $$ Temp <=300.0)
		this.templLevel=normal;
	
}  else if (Temp >=300.0) {
	this.templLevel=Dangerous;
}
else {
	this.templLevel= low;
 }
}
public void changeTemp(int Temp) {
	this.Temp=Temp;
	changeTempLevel(Temp);
}
	
}