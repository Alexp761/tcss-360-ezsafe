package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;

public class SmokeDetector extends Device {

   //Actual LOW and NORMAL values are not esimated yet
    private static double LOWSMOKE = 1.0;
    private static double NORMALSMOKE = 2.0;
    private static final String DANGER= "Danger";
    private static final String NORMAL = "Normal";
    private static final String LOW = "Low";
    private String smokeLevel;
    private double particleInAir;
    
    
    
    public SmokeDetector(final String ID,final Boolean state,final String smokeLevel,final double particle){
        super.deviceID = ID;
        super.deviceState = state;
        this.smokeLevel = smokeLevel;
        this.particleInAir=particle;
    
    }
    
    
    public String getSmokeLevel(){
    
    return this.smokeLevel;
    
    }
    
    public double getParticle(){
    
        return this.particleInAir;
    
    
    }
    
    private void changeSmokeLevel(final double particle){
    
        if(particle <= LOWSMOKE){
            this.smokeLevel = LOW;
    
        }
        else if(particle<= NORMALSMOKE ){
             this.smokeLevel = NORMAL;
    
        }
      
        else{
             this.smokeLevel = DANGER;
    
        }
    
    
    
    }
    
    public void changeParticleInAir(final double particle){
    
        this.particleInAir = particle;
        changeSmokeLevel(particle);
    
       
    
    }

}
