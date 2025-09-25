import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicContactFormChecker {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		
		System.out.println( "Enter name : " );
		String name = userInput.nextLine();
		
		System.out.println( "Enter phone number : " );
		String number = userInput.nextLine();
		
		System.out.println( "Enter your mail id : " );
		String mailId = userInput.nextLine();
		
		String regex = "^[A-Z][a-zA-Z\\s]*$";
		
		Pattern namePattern = Pattern.compile( regex );
		Matcher nameMatcher = namePattern.matcher( name );
		
		if( nameMatcher.matches() ) {
			
			System.out.println( "Your name is " + name );
			
		}
		
		else {
			
			System.out.println( "Please enter a name with letters only" );
			
		}
		
		String regexNumber = "\\d{10}$";
		
		Pattern numberPattern = Pattern.compile( regexNumber );
		Matcher numberMatcher = numberPattern.matcher( number );
		
		if( numberMatcher.matches() ) {
			
			System.out.println( "Your phone number is : " + number );
			
		}
		
		else {
			
			System.out.println( "Please enter a 10 digit number" );
			
		}
		
		String regexMailId = ".*@.*\\..*";
		
		Pattern mailPattern = Pattern.compile( regexMailId );
		Matcher mailMatcher = mailPattern.matcher( mailId );
		
		if( mailMatcher.matches() ) {
			
			System.out.println( "Your mail id is : " + mailId );
			
		}
		
		else {
			
			System.out.println( "Enter a valid mail id format" );
			
		}
		
	}
}