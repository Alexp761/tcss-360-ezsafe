package com.threesixty.ezsafe.Hazard;

import java.text.Normalizer;

import com.threesixty.ezsafe.Device;

public class CarbonMonoxideDetector extends Device {

private static final double LOW = 1.0;
private static final double NORMAL = 2.0;
private String CMLevel;
private double CMParticle;

public CarbonMonoxideDetector(final String carbonLevel,final double carbonParticle){
    this. CMLevel = carbonLevel;
    this. CMParticle = carbonParticle;

}

public getCMLevel(){
  
     return this.CMLevel;

}

public getCMParticle(){
 
      return this.CMParticle;   
    
}

private setCMLevel(final double particle){

if(particle <= LOW){
   this.CMLevel = "Low";

}
else if (partcile <= NORMAL){

  this.CMLevel = "Normal";

}

else{
  this.CMLevel = "Danger";

}

}

public changeCMPartile(final double particle ){

    this.CMParticle = particle;
    setCMLevel(particle);
}

}

