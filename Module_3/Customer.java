/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/

// Create customer class
public class Customer {
    private String name;    // private field to store customer name
    private String address; // private field to store customer address
    private String city;    // private field to store customer city
    private String zip;     // private field to store customer zip code

    // no-argument constructor to create a default customer
    public Customer() {
        name = "";
        address = "";
        city = "";
        zip = "";
    }

    // argument constructor to create a customer with specified data fields
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    // accessor method to get customer name
    public String getName() {
        return name;
    }

    // accessor method to get customer address
    public String getAddress() {
        return address;
    }

    // accessor method to get customer city
    public String getCity() {
        return city;
    }

    // accessor method to get customer zip code
    public String getZip() {
        return zip;
    }

    // override the toString() method to return a string description of the customer
    @Override
    public String toString() {
        return
               "\n  --Custumer Details--"+ "\n" +
               "  Name: " + name + "\n" +
               "  Address: " + address + "\n" +
               "  City: " + city + "\n" +
               "  Zip: " + zip;
               
    }
}// End Customer
