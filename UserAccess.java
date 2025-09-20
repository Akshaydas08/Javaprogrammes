import java.util.Scanner;

public class UserAccess {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
	    String userName = "admin";
	    String password = "java123";
	    
	    System.out.print( "Enter user name : " );
	    String uName = userInput.nextLine();
	    
	    System.out.println();
	    
	    System.out.print( "Enter password :" );
	    String passcode = userInput.nextLine();
	    
	    if ( userName.equals( uName ) && password.equals( passcode ) ) {
	    	
	    	System.out.println( "Login Successful" );
	    	
	    }
	    else {
	    	
	    	System.out.println( "Access Denied" );
	    	
	    }
	}
}