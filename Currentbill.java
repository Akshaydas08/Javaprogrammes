//package test1;
import java.util.Scanner;
public class Currentbill {

	public static void main(String[] args) {
		
		Scanner currentUnit = new Scanner( System.in );
		
		
		System.out.print( "Enter your current unit = " );
		
		int unit = currentUnit.nextInt();
		
		if ( unit>=100 && unit<200 ) {
			
			System.out.println( "Your current bill is: " + unit*9 );
			
		}
		else if ( unit >=200 && unit<300 ) {
			
			System.out.println( "Your current bill is: "+ unit*12 );
			
		}
		else if ( unit >=300 && unit<400 ) {
			
			
			System.out.println( "Your current bill is: "+unit*15 );
			
		}
		else if ( unit<100 ) {
			
			System.out.println( "Your current bill is: "+unit*3 );
			
		}
		else if ( unit>=400 ) {
			
			System.out.println( "Your current bill is: "+unit*18 );
			
		}
		else {
			
			System.out.println( "Enter a valid unit number for the current bill generation!" );
			
		}
	}
}