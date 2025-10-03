import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		
		System.out.println( "Enter a number to do fibonacci series : " );
		
		int fiboNumber = userInput.nextInt();
		
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		
		System.out.println( "The fibonacci series according to your input is : " );
		
		if ( fiboNumber >= 0 ) {
			
			System.out.print( number1 + " " );
			System.out.print( number2 );
			
		while ( sum <= fiboNumber ) {
				
			sum = number1 + number2;
			
			System.out.print( " " + sum );
			
			number1 = number2;
			
			number2 = sum;
			
			}
		}
		
		userInput.close();
		
	}
}