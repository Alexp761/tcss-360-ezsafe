package com.threesixty.ezsafe.Hazard;

import com.threesixty.ezsafe.Device;

public class CarbonMonoxideDetector extends Device {

private static final double LOWCOMIN = 0.5;
private static final double LOWCOMAX = 5.0;
private static final double NORCOMIN = 5.0;
private static final double NORCOMAX= 30.0;
private static final String DANGER= "Danger";
private static final String NORMAL = "Normal";
private static final String LOW = "Low";
private String CMLevel;
private double CMParticle;

public CarbonMonoxideDetector(final String ID,final Boolean state,final String carbonLevel,final double carbonParticle){

    super.deviceID = ID;
    super.deviceState = state;
    this.CMLevel = carbonLevel;
    this.CMParticle = carbonParticle;

  }

  public String getCMLevel() {

    return this.CMLevel;

  }

  public double getCMParticle() {

    return this.CMParticle;
  }

  private void setCMLevel(final double particle){

    if(particle <= LOWCOMIN ||(particle>=LOWCOMIN && particle<LOWCOMAX)){
       this.CMLevel = LOW;

    } else if (particle >= NORCOMIN && particle<NORCOMAX){
      this.CMLevel = NORMAL;
    }

    else{
      this.CMLevel = DANGER;

    }

}

  public void changeCMPartile(final double particle) {

    this.CMParticle = particle;
    setCMLevel(particle);
  }

}
