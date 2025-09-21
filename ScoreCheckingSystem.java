import java.util.Scanner;

public class ScoreCheckingSystem {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		
		int score[] = new int[ 5 ];
		
		System.out.println( "Enter score" );
		
		for( int i = 0;i<score.length;i++ ) {
			
			System.out.print( "Student " + ( i + 1 ) + " : " );
			score[ i ] = userInput.nextInt();
			
		}
		
		for( int i = 0;i<score.length;i++ ) {
			
			if( score[ i ] >= 90 && score[ i ] <= 100 ) {
				
				System.out.println( "Student " + ( i + 1 ) + " scored Excellent" );
				
			}
			
			else if( score[ i ] >= 75 && score[ i ] <= 89 ) {
				
				System.out.println( "Student " + ( i + 1 ) + " scored Good" );
				
			}
			
			else if( score[ i ] >= 50 && score[ i ] <= 74 ) {
				
				System.out.println( "Student " + ( i + 1 ) + " scored Average" );
				
			}
			
			else if( score[ i ] < 50 ) {
				
				System.out.println( "Student " + ( i + 1 ) + " Failed" );
				
			}
		}
	}
}