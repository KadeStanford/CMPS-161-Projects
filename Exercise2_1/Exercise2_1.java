// CMPS 161
// Program Assignment 02
// James Stanford 
// W0719633



import java.util.Scanner;

public class Exercise2_1 {
   public static void main(String[] args) {
        
	   // Enter a temperature in celsius
	   //Class Notes Chapter 2 Page 5: Read Scanner
	   Scanner input = new Scanner (System.in);
	   System.out.print("Enter a number for Celsius:");
	   double Celsius = input.nextDouble();
	   // Convert celsius to fahrenheit
	   double Fahrenheit = (9.0/5) * Celsius + 32;
	   // Display the result
	   //Chapter 2 Page 3: System.out.println
	   System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit.");
   }
}
