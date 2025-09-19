import java.util.Scanner;

abstract class ride {
	
	abstract int calculateFare( int distance );
	
	public void rideType() {
		
		System.out.println( "Generic ride" );
		
	}
}

class autoRide extends ride {
	
	public int calculateFare( int distance ) {
		
		int fare = 10;
		
		fare *= distance;
		
		return fare;
		
	}
	
	public void rideType() {
		
		System.out.println( "Auto ride" );
		
	}
}

class carRide extends ride {
	
	public int calculateFare( int distance ) {
		
		int fare = 20;
		
		fare*= distance;
		
		return fare;
		
	}

	public void rideType() {
		
		System.out.println( "Car ride" );
		
	}
}

public class BookingApp {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		
		System.out.println( "Select 1 for Auto ride or 2 for Car ride : " );
		int userChoice = userInput.nextInt();
		
		System.out.println( "Enter distance of your travel :" );
		int distance = userInput.nextInt();
		
		autoRide auto1 = new autoRide();
		carRide car1 = new carRide();
		
		
		switch( userChoice ) {
		
		case 1 : auto1.rideType();
		         int autoFare = auto1.calculateFare( distance );
		         System.out.println( "Total fare of the ride is : " + autoFare );
		         break;
		         
		case 2 : car1.rideType();
		         car1.calculateFare( distance );
		         int carFare = car1.calculateFare( distance );
		         System.out.println( "Total fare of the ride is : " + carFare );
		         break;
		         
		}
		
	userInput.close();
	
	}
}