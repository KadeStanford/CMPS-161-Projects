// CMPS 161
// Program Assignment 03
// James Stanford
// W0719633

import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double Interest = 0.00417;
		

	    // Enter monthly saving: a positive integer
		   System.out.print("Enter Monthly Saving Value: ");
		   double savingValue = input.nextDouble(); 
    	// After the first month account value
		   double total = savingValue * (1 + Interest);
     	// After the second month account value
		   total = ((savingValue + total) * (1 + Interest));
    	// After the third month account value
		   total = ((savingValue + total) * (1 + Interest));
    	// After the fourth month account value
		   total = ((savingValue + total) * (1 + Interest));
    	// After the fifth month account value
		   total = ((savingValue + total) * (1 + Interest));
    	// After the sixth month account value
		   total = ((savingValue + total) * (1 + Interest));
		// Display the sixth month account value
		   System.out.println("After six months, the account value is " + total);
  	}
}

