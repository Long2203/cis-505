/*
   Nguyen, L. (2023). CIS 505 Intermediate Java Programming.
Bellevue University
*/ 
// Define a public class named Fan
public class Fan {
    // Define four constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // Define private fields for fan speed, on/off state, radius, and color
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    // Define a no-argument constructor that sets the fan to its default state
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }
    
    // Define an argument constructor that takes in fan speed, on/off state, radius, and color as arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    // Define getter method for fan speed
    public int getSpeed() {
        return this.speed;
    }
    
    // Define setter method for fan speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    // Define getter method for on/off state
    public boolean isOn() {
        return this.on;
    }
    
    // Define setter method for on/off state
    public void setOn(boolean on) {
        this.on = on;
    }
    
    // Define getter method for fan radius
    public double getRadius() {
        return this.radius;
    }
    
    // Define setter method for fan radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Define getter method for fan color
    public String getColor() {
        return this.color;
    }
    
    // Define setter method for fan color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Override toString method to return a string description of the fan
    @Override
    public String toString() {
        // If fan is on, return The fan speed is set to  speed value with a color and a radius of radius value
        if (this.on) {
            return "The fan speed is set to " + this.speed + " with a color of " + this.color + " and a radius of " + this.radius;
        } else {
            // If fan is off, return The fan is color with a radius of radius value and the fan is off
            return "The fan is " + this.color + " with a radius of " + this.radius + " and the fan is off";
        }
    }
}// End Fan


