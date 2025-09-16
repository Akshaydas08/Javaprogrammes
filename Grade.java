

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "Enter your grade = " );
		
		int grade = scanner.nextInt();
		
		if( grade >= 90 && grade <=100 ) {
			
			System.out.println( "Your grade is A+" );
			
		}
		
		// else if ( grade >= 70 && grade < 80 ) {
			
		// 	System.out.println( "Your grade is B+" );
			
		// }
		else if ( grade >= 60 && grade < 70 ) {
			
			System.out.println( "Your grade is B" );
			
		}
		else {
			
			if ( grade<60 ) {
				
			System.out.println( "You have failed in th exam" );
			
			}
			else if ( grade>100 ) {
				
				System.out.println( "You have entered wrong grade!" );
				
			}
			
		}
	}
}