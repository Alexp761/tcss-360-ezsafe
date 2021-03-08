package com.threesixty.ezsafe.Hazard;


import com.threesixty.ezsafe.Device;

public class CarbonMonoxideDetector extends Device {

//Actual LOW and NORMAL values are not esimated yet
private static final double LOWCO = 1.0;
private static final double NORMALCO = 2.0;
private static final String DANGER= "Danger";
private static final String NORMAL = "Normal";
private static final String LOW = "Low";
private String CMLevel;
private double CMParticle;

public CarbonMonoxideDetector(final String ID,final Boolean state,final String carbonLevel,final double carbonParticle){
    super.deviceID = ID;
    super.deviceState = state;
    this. CMLevel = carbonLevel;
    this. CMParticle = carbonParticle;

}

public String getCMLevel(){
  
     return this.CMLevel;

}

public double getCMParticle(){
 
      return this.CMParticle;   
    
}

private void setCMLevel(final double particle){

if(particle <= LOWCO){
   this.CMLevel = LOW;

}
else if (particle<= NORMALCO){

  this.CMLevel = NORMAL;

}

else{
  this.CMLevel = DANGER;

}

}

public void changeCMPartile(final double particle ){

    this.CMParticle = particle;
    setCMLevel(particle);
}

}

