/**
 * @breif: Zheng Zhong
 * @Project: ezsafe smoke dectetor 
 */
package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;
/**
 *Smoke dectector class
 * 
 * 
 */
public class SmokeDetector extends Device {

    private static double PM25STDDENSITY = 35.0;
    private static double PM10STDENSITY = 150.0;
    private static double PM25STDSIZE = 2.5;
    private static double PM10STDSIZE = 10.0;
    private static final String DANGER = "Danger";
    private static final String NORMAL = "Normal";
    private static final String LOW = "Low";
    private String smokeLevel;
    private double particleDensity;
    private double particleSize;

/**
 *Smoke dectector class constructor
 * @param  ID device ID
 * @param  state device state
 * @param  particleDensity particle density
 * @param  particleSize particle size
 * 
 * 
 * 
 */
    public SmokeDetector(final String ID, final Boolean state, final double particleDensity,
            final double particleSize) {
        super.deviceID = ID;
        super.deviceState = state;
        this.particleDensity = particleDensity;
        this.particleSize = particleSize;
        changeSmokeLevel(particleSize, particleDensity);

    }

/**
 *Smoke level getter
 * @return current smoke level in past 30 seconds
 * 
 * 
 */

    public String getSmokeLevel() {

        changeSmokeLevel(this.particleSize, this.particleDensity);

        return this.smokeLevel;

    }
/**
 *particle density  getter
 * @return particle density in past 30 secconds
 * 
 * 
 */

    public double getParticleDensity() {

        return this.particleDensity;

    }

/**
 *updates the smoke level 
 * @param particleSize current particle size
 * @param partcileDensity current partile density
 * 
 * 
 */

    private void changeSmokeLevel(final double particleSize, final double particleDensity) {

        
        if(particleSize<=PM25STDSIZE){
           
            if(particleDensity <= PM25STDDENSITY/2){

                this.smokeLevel = LOW;
            }
            else if(particleDensity > PM25STDDENSITY/2 && particleDensity <= PM25STDDENSITY){

                this.smokeLevel = NORMAL;

            }
            else {

                this.smokeLevel = DANGER;

            }
            

        }
        else if (particleSize > PM25STDSIZE && particleSize <= PM10STDSIZE) {

            
            if(particleDensity <= PM10STDENSITY/2){

                this.smokeLevel = LOW;
            }
            else if(particleDensity > PM10STDENSITY/2 && particleDensity <= PM10STDENSITY){

                this.smokeLevel = NORMAL;

            }
            else {

                this.smokeLevel = DANGER;

            }


        }    
        
        
        else{

                this.smokeLevel =LOW;
        }
        
    }
/**
 *updates the partile Density
 *
 * @param partcileDensity current partile density
 * 
 * 
 */
    
    public void changeParticeDensity(final double particleDensity) {

        this.particleDensity = particleDensity;
        

    }
/**
 *updates the partile Size
 *
 * @param partcileSize current partile size
 * 
 * 
 */
    public void changeParticleSize(final double particleSize){

       this.particleSize = particleSize;


    }

}
