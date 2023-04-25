// CMPS 161
// Program Assignment 08
// James Stanford
// W#0719633
import java.util.Scanner;

public class Exercise6_3 {
   public static void main(String[] args) {
      
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("Enter a number: ");
	   
	   int number = input.nextInt();
	   
	   if (isPalindrome(number)) {
		   System.out.println("Congrats, it's a Palindrome!");
	   } else {
		   System.out.println("Yikes, this number isn't a Palindrome. Sorry!");
	   }
   }
  
   public static boolean isPalindrome(int number) {
	  String num1 = String.valueOf(number);
	  String num2 = String.valueOf(reverse(number));
	  
	  return num1.equals(num2);
    
   }

   public static int reverse(int number) {
      String tempString = "";
      
      while (number > 0) {
 
    	  int t = number % 10;
    	  number /= 10;
    	  tempString += t;
      }
      
      return Integer.parseInt(tempString);
   }
}
