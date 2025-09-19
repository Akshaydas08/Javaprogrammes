abstract class user {
	
	abstract void showMessage();
	
	public void displayUserType() {
		
		System.out.println( "USer type selected" );
		
	}
}

class adminUser extends user {
	
	public void showMessage() {
		
		System.out.println( "Welcome,admin!" );
		
	}	
}

class guestUser extends user {
	
	public void showMessage() {
		
		System.out.println( "Welcome,guest!" );
		
	}
	
}
public class WelcomeMessage {

	public static void main(String[] args) {
		
		adminUser admin1 = new adminUser();
		guestUser user1 = new guestUser();
		
		System.out.println( "***************" );
		admin1.displayUserType();
		admin1.showMessage();
		
		System.out.println( "***************" );
		user1.displayUserType();
		user1.showMessage();
		System.out.println( "***************" );
	}
}