/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// This class extends the Product class
public class Bag extends Product {
// Declare a private String field to represent the type of the bag
private String type;

 // This is a no-argument constructor that calls another constructor with default values
public Bag() {
this("", "", 0, "");
}
  // This is a constructor that initializes the Bag with the specified values
public Bag(String code, String description, double price, String type) {
    super(code, description, price);
    this.type = type;
}
 // This method returns the type of the Bag
public String getType() {
return type;
}
// This method sets the type of the Bag to the specified value
public void setType(String type) {
this.type = type;
}

// Override the toString() method of the Product class to include the type of the Bag
@Override
public String toString() {
return super.toString() + "\n  Type: " + type;
}
}



