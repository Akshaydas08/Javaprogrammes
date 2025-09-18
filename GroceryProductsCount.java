import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryProductsCount {
    
        	
	public static float discount ( float cost ) {
		    
		    float discountPrice;
            if( cost >= 500 ) {
			
			 discountPrice = cost - ( cost * 10 /100 );
             
			 return discountPrice;
		}
            else {
            	
            	return cost;
            	
            }
	}

	public static void main(String[] args) {
		
		Scanner number = new Scanner( System.in );
		
		String items[] = { "Rice","Sugar","Oil","Soap","Milk" };
		int pricePerUnit[] = { 50,40,100,25,30 };
		
		System.out.print( "Available items " );
		
		for ( int i = 0;i<items.length;i++ ) {
			
			System.out.println( items[ i ] );
			
		}
		
		
		System.out.println( "Enter quantity => " );
		int quantity[] = new int[ items.length ];
		
		try {
		for( int i = 0;i<items.length;i++ ) {
			
			System.out.println( items[ i ] + " : " );
			quantity[ i ] = number.nextInt();
			
		}}
          catch ( InputMismatchException e ) {
			System.out.println( "===============" );
			System.out.println( "Enter numbers only please!" );
            System.out.println( "===============" );
			
		}

		System.out.println( "===============" );
		System.out.println( "Total cost is : " );
		float cost = 0;
		for ( int i =0;i<items.length;i++ ) {
			
			cost += ( quantity[ i ] * pricePerUnit[ i ] );
			
		}
		System.out.println( cost );
        System.out.println( "===============" );
		
		float discounts = discount( cost );
		System.out.println( "===============" );
		System.out.println( "Total cost after discount is : " + discounts );
        System.out.println( "===============" );
		
		
		 LocalDateTime currentDateTime = LocalDateTime.now();
		   System.out.println( currentDateTime );
}
}