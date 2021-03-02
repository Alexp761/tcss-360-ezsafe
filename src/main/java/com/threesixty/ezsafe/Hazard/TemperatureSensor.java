package com.threesixty.ezsafe.Hazard;

// be able to set temprature of the house 
// set the temprature of separte rooms 
// classify the temprature level 
// refering room temprature e clasify them confortable between 66.0 and 77.0 degree F 
// below 66.0 ww will name it as cold
// above 77.0 we will name it as warm. 

// 
public class TemperatureSensor extends Device {
	private float normalTemp=66.0; 
	private float warmTemp=78.0;
	private float coldTemp=65.0;
	
     private String confortable= "confortable ";
     private String warm = "warm";
     private String cold = "cold";
     private  float Temp;
     private String templLevel;
     
     public TemperatureSensor(String ID, Boolean state, float Temp, String tempLevel)
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