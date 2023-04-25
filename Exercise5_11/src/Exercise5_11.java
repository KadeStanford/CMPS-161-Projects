// CMPS 161
// Program Assignment 06
// James Stanford
// W0719633
	public class Exercise5_11 {
	public static void main(String[] args) {
		
		final int lines = 10;
		int count = 0; 

		for (int number = 100; number <= 200; number++) {
			
			if (number % 5 == 0 ^ number % 6 == 0) {
				count++;
			
			if (count % lines == 0)
				System.out.println(number);
			
			else
				System.out.print(number + " ");			
			 }
		  }
				System.out.println();
	 }
  }

