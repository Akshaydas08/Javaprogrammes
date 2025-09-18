
interface vehicle {
	
	   public void start();
	   public void stop();
		
	}
	interface fuelBased {
		
		public void refuel();
		
	}

	class car implements vehicle,fuelBased {
		
		public void start() {
			
			System.out.println( "Car engine started" );
			
		}
		public void stop() {
			
			System.out.println( "Car engine stopped" );
			
		}
		public void refuel() {
			
			System.out.println( "Car is refueling at the station" );
			
		}
	}
		
	class evScooter implements vehicle {
		
		public void start() {
			
			System.out.println( "Electric scooter is powered on" );
			
		}
		public void stop() {
			
			System.out.println( "Electric scooter is powered off" );
			
		}
		
	}
		
	
public class rentalSystem {

	public static void main(String[] args) {
		
		car car1 = new car();
		evScooter evs1 = new evScooter();
		
		car1.start();
		car1.stop();
		car1.refuel();

		System.out.println( "===============" );
		
		evs1.start();
		evs1.stop();

		System.out.println("===============" );
		
	}
}