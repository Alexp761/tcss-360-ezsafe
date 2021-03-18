package com.threesixty.ezsafe.Hazard;

import java.util.*;

import com.threesixty.ezsafe.Device;

/**
 *
 * @author Michael Tademu
 * 
 * 
 * 
 */

public class TemperatureSensor extends Device {
    private double Temperature;
    private String TemperatureLevel;

    public TemperatureSensor(String deviceID, boolean state, double Temperature) {
        super.deviceID = deviceID;
        this.Temperature = Temperature;
        super.deviceState = state;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getTemperatureLevel() {
        return TemperatureLevel;
    }

    public boolean getDeviceState() {
        return deviceState;
    }

    public void turnOnOff() {
        deviceState = !deviceState;
    }
    
    public void setDeviceState(boolean state) {
    	deviceState = state;
    }

    public void changeTempLevel(double Temperature) {
        if (Temperature < 41) {
            this.TemperatureLevel = " Low";
        } else if (Temperature > 300) {
            this.TemperatureLevel = "Dengerous";
        } else {
            this.TemperatureLevel = "normal";

        }
    }

    public void changeTemp(double degree) {
        this.Temperature = Temperature;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        double Temperature;

        System.out.println("Enter device ID: ");
        id = sc.nextLine();
        System.out.println("Enter device Temperature: ");
        Temperature = sc.nextDouble();
        System.out.println("Enter device status (ON/OFF): ");
        String status = sc.nextLine();
        if (status.equals("")) {
            status = sc.nextLine();

        }
        boolean onOff;
        if (status.toLowerCase().equals("ON")) {
            onOff = true;
        } else {
            onOff = false;
        }

        TemperatureSensor d = new TemperatureSensor(id, onOff, Temperature);

        d.changeTempLevel(Temperature);

        System.out.println("Device Level: " + d.getTemperatureLevel());

    }
}
