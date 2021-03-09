package com.threesixty.ezsafe.Hazard;

// be able to set temprature of the house 
// set the temprature of separte rooms 
// classify the temprature level 
// refering room temprature e clasify them confortable between 66.0 and 77.0 degree F 
// below 66.0 ww will name it as cold
// above 77.0 we will name it as warm. 

// 
public class TemperatureSensor extends Device {
	private static final float normalTemp=66.0; 
	private static final float warmTemp=78.0;
	private static final float coldTemp=65.0;
	
     private static final String confortable= "confortable ";
     private static final String warm = "warm";
     private static final String cold = "cold";
     private  float Temp;
     private String templLevel;
     
     public TemperatureSensor(String ID, Boolean state, float Temp, String tempLevel){
	   super.device ID = ID;
	   super.deviceState = state;
	   this.Temp = Temp;
	   this. tempLevel = tempLevel
	    
	     
}
public  float getTempLevel() {
	return this.Temp;
}
public String getTempLevel() {
	return this.TempeLevel;
}
private void setTempLevel(int Temp) {
	if(Temp>=60.0 $$ Temp <=77.0)
		this.templLevel=confortable;
	
} if else (Temp >77.0) {
	this.templLevel=warm;
}
else {
	this.templLevel= cold;
}
