package com.threesixty.ezsafe.Hazard;
import java.util.*;

/**
*
* @author Michael Tademu
* 
* 
*/



public class TempratureSensor {
    private  String deviceID;
    private double temprature;
    private boolean onOff;
    private String tempratureLevel;

    public TempratureSensor(String deviceID, double temprature, boolean onOff) {
        this.deviceID = deviceID;
        this.temprature = temprature;
        this.onOff = onOff;
    }
    
    

    public String getDeviceID() {
        return deviceID;
    }

    public String getTempratureLevel() {
        return tempratureLevel;
    }
    
    
    public boolean getDeviceState(){
        return onOff;
    }
    
    public void turnOnOff(){
        if(onOff){
            onOff = false;
        }
        else{
            onOff = true;
    }
    }
    
    public void changeTempLevel(double temprature){
        if(temprature<41 ){
            this.tempratureLevel=" Low";
        } else if(temprature>300){
            this.tempratureLevel="Dengerous";
        }
        else{
            this.tempratureLevel = "normal";
  
    }
    }
    
    public void changeTemp(double degree){
        this.temprature = temprature;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String id;
        double temprature;
        
        System.out.println("Enter device ID: " );
        id = sc.nextLine();
         System.out.println("Enter device Temprature: " );
         temprature = sc.nextDouble();
         System.out.println("Enter device status (ON/OFF): " );
         String status = sc.nextLine();
         if(status.equals("")){
             status = sc.nextLine();
         }
         boolean onOff;
         if(status.toLowerCase().equals("ON")){
             onOff = true;
         }
         else{
             onOff = false;
         }
         
         TempratureSensor d = new TempratureSensor(id, temprature, onOff);
         
         d.changeTempLevel(temprature);
         
         System.out.println("Device Level: "+d.getTempratureLevel() );
         
         
         
         
        
        
        
    }
}
