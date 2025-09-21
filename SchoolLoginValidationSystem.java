import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolLoginValidationSystem {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		
		int password =0,roleId = 0;
		
		System.out.print( "Enter user code : " );
		char userCode = userInput.next().toUpperCase().charAt(0);
		if( userCode == 'G' ) {
			
			System.out.println( "Welcome Guest,View-only access" );
		    
		}
		else {
		try {
		System.out.print( "Enter your password : " );
	    password = userInput.nextInt();
		System.out.print( "Enter your role id : " );
	    roleId = userInput.nextInt();}
		catch( InputMismatchException e ) {
			
			System.out.println( "Enter a valid input" );
			
		}
		
		switch ( userCode ) {
		
		case 'A' : if ( ( password == 1234 ) && ( roleId == 1 ) ) {
			
			System.out.println( "Welcome Admin.Full access granded" );
			
		    }
		    break;
		    
		case 'S' : if ( (password == 1111 ) && ( roleId == 2 ) ) {
			
			System.out.println( "Welcome Student.Limited access granted" );
			
		}
		break;
		           
		default : System.out.println( "invalid credentials or role" );
		
		}
		}
		
		userInput.close();
		
	}
}