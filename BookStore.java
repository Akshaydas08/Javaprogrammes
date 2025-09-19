import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		
		Scanner number = new Scanner( System.in );
		
		int bookCost = 275;
		
		System.out.println( "Enter the number of orders : " );
		
		int order = number.nextInt();
		
		double totalPrice = ( double )bookCost * order;
		
	    System.out.println( "===============" );
	    System.out.println( "Total price of your order is : " + totalPrice );
	    System.out.println( "===============" );
	    
	    int discountValue = 10;
	    
	    totalPrice -= ( ( double )discountValue * totalPrice )/100;
	    System.out.println( "===============" );
	    System.out.println( "Total price with 10% discount is : " + totalPrice );
	    System.out.println( "===============" );
	    
	    number.close();
	    
	}
}