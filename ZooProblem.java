interface Animal {
	
      public void makeSound();
      public void move();
	
}
class bird implements Animal {
	
	public void makeSound() {
		
		System.out.println( "Bird chirps" );
		
	}
	
	public void move() {
		
		System.out.println( "Bird flies" );
		
	}
	
}

  class Dog  implements Animal {
	
	public void makeSound() {
		
		System.out.println( "Dog barks " );
		
	}
	
	public void move() {
		
		System.out.println( "Dog runs" );
		
	}
	
}
public class ZooProblem {

	public static void main(String[] args) {
		
	
          bird bird1 = new bird();
          Dog dog1 = new Dog();
          
          bird1.makeSound();
          bird1.move();
          dog1.makeSound();
          dog1.move();
		
	}
}