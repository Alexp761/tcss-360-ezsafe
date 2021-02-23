package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;

public class SmokeDetector extends Device {

   //Actual LOW and NORMAL values are not esimated yet
    private static double LOW = 1.0;
    private static double NORMAL = 2.0;
    private String smokeLevel;
    private double particleInAir;
    
    
    
    public SmokeDetector(final String smokeLevel,final double particle){
    
        this.smokeLevel = smokeLevel;
        this.particleInAir=particle;
    
    }
    
    
    public getSmokeLevel(){
    
    return this.smokeLevel;
    
    }
    
    public getParticle(){
    
        return this.particleInAir;
    
    
    }
    
    private void changeSmokeLevel(final double particle){
    
        if(partcile <= LOW){
            this.smokeLevel = "Low";
    
        }
        else if(partcile <= NORMAL ){
             this.smokeLevel = "Normal";
    
        }
      
        else{
             this.smokeLevel = "Danger";
    
        }
    
    
    
    }
    
    public void changeParticleInAir(final double particle){
    
        this.particleInAir = particle;
        changeSmokeLevel(particle);
    
       
    
    }

}
