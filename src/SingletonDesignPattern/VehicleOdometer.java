package src.SingletonDesignPattern;

import java.util.concurrent.locks.Lock;

//I don't want to get multiple creations of my VehicleOdometer class. THats why I am using Singleton pattern as an example
// Reading should also be static as odometer reading will always increase.

public class VehicleOdometer {
    private static VehicleOdometer instance; // = ( new VehicleOdometer --> Eager Initialization)
    private int reading = 1022;


    private VehicleOdometer() {
        System.out.println("Singleton constructor called !!");
    }
    public static VehicleOdometer getInstance(){
        if (instance == null) {
            instance = new VehicleOdometer();
        }
        return instance;
    }
    public void setOdometerReading(){
        instance.reading = reading + 100;
    }
    public void getOdometerReading(){
        System.out.println(reading + " KMs");
    }
}
