// CMPS 161
// Program Assignment 08
// James Stanford
// W#0719633

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise7_9 {
   public static void main(String[] args) {
      double[] numbers = new double[10];
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter 10 numbers: ");
      for (int i = 0; i < 10; i++) {
    	  numbers[i] = input.nextDouble();
      }
      
      System.out.println("the smallest number in the set is " + min(numbers));

   	  }

   public static double min(double[] list) {
      double m = list[0]; 
      
      for(int i = 1; i < Array.getLength(list); i++) {
    	  	if (list[i] < m) {
    	  		m = list[i];
    	  	}
    	  
      	}
	return m;
   	}
}

