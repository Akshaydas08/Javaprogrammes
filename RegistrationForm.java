import java.util.Scanner;

public class RegistrationForm {
    
    public static void main(String[] args) {
		
		Scanner userInput = new Scanner ( System.in );
		
		//heading for registration form
		System.out.println( "===============" );
		System.out.println( "Registration Form" );
		
		//input for first name
		System.out.println( "Enter first name :" );
		String firstName = userInput.nextLine();
		
		//input for second name
		System.out.println( "second name : " );
		String secondName = userInput.nextLine();
		
		userInput.nextLine();
		
		//input for age
		System.out.println( "Enter your age : " );
		int age = userInput.nextInt();
		
		//Welcome message
		System.out.println( "===============" );
		System.out.println( "Welcome, " + firstName + " " + secondName );
	    System.out.println( "===============" );
	    
	}
}