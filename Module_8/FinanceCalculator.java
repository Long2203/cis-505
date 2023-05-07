/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
//Create a class named FinanceCalculator 
public class FinanceCalculator {
	private static int MONTHS_IN_YEAR = 12; // total number of months based on the number of years
	public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
		int months = years * MONTHS_IN_YEAR;  //calculates the total number of months based on the number of years
	    double interestRate = 1 + rate / 100; // calculates the interest rate by adding 1 to the rate and dividing by 100
	    double presentValue = monthlyPayment * months; // calculates the present value by multiplying the monthly payment by the number of months
	    double futureValue = presentValue * (Math.pow(interestRate, months)); //calculates the future value by raising the interest rate to the power of the number of months and multiplying it by the present value
	    return futureValue; // return future value
	    }
} // end FinanceCalculator