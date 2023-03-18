
/*
   Nguyen, L. (2023). CIS 505 Intermediate Java Programming.
Bellevue University
*/ 
// Define a public class named TestFanApp
public class TestFanApp {
    public static void main(String[] args) {
        // Create a default fan using the no-argument constructor
        Fan fan1 = new Fan();
        // Create a fan with specific properties using the argument constructor
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8, "blue");
        
        // Display the properties of fan1 and fan2 using the toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }// end Main
}// end TestFanApp