// CMPS 161
// Program Assignment 07
// James Stanford
// W0719633
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
       
    	
   Scanner input = new Scanner(System.in);
       
   System.out.print("Enter a integer: ");
        
   		int number = input.nextInt();

   System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    
}

    public static int sumDigits(long n) {
        int sum = 0;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

/* Sample Run
Enter a  number: 234
The sum of digits for 234 is 9
*/