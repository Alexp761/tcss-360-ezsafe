package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;

public class SmokeDetector extends Device {


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
    
    public void changeSmokeLevel(final double particle){
    
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
    
       
    
    }

}
