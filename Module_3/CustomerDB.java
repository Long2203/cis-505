/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// Create CustomerDB
public class CustomerDB {
    
    // public static method to get customer by id
    public static Customer getCustomer(Integer id) {
        
        // check if id matches 1007 and return a new customer object with unique fields
        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        }
        // check if id matches 1008 and return a new customer object with unique fields
        else if (id == 1008) {
            return new Customer("Long Nguyen", "302 Atlanta", "Egg Harbor", "06345");
        }
        // check if id matches 1009 and return a new customer object with unique fields
        else if (id == 1009) {
            return new Customer("Loki Johnson", "782 Tree St", "New Wark", "02345");
        }
        // if no matches found, return a default customer object
        else {
            return new Customer();
        }
    }
} // End CustomerDB