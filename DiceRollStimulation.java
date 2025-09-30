import java.util.Scanner;

public class DiceRollStimulation {
	
	public static void main(String[] args ) throws InterruptedException {
		
		Scanner userInput = new Scanner( System.in );
		
		System.out.println( "Enter R to roll the dice : " );
		
		String diceRoll = userInput.nextLine().toUpperCase();
		
		if( diceRoll.equals( "R" ) ) {
			
			System.out.println( "Dice is rolling..." );
			
			Thread.sleep( 3000 );
			
			System.out.println( "Rolling..." );
			
			Thread.sleep( 3000 );
			
			System.out.println( "Your dice number is : " + ( int ) Math.ceil( Math.random() * 10 ) );
			
		}
		
		else {
			
			System.out.println( "Please enter a valid input" );
			
		}
	}
}