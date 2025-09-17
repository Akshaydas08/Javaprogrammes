import java.util.Scanner;

public class BasicInventoryChecker {

                    public static void main(String[] args) {
		
		Scanner quantity = new Scanner( System.in );
		
		System.out.print( "Enter the quantities : " );
		
		int quantities[] = new int[ 5 ];
		
		for( int i = 0;i<5;i++ ) {
			
			quantities [ i ] = quantity.nextInt();
			
		}
		
		int sum = 0;
		int flag = 0;
		for ( int i = 0;i<5;i++ ) {
			for( int j = 0;j<5;j++ ) {
			if( quantities[ j ] == 0 ) {
				
				System.out.println( "The product " + j + " is out of stock!" );
                flag = 1;
			}}
             
			if ( flag == 1 ) {
				
				break;
				
			}
			else if ( quantities[ i ] != 0 ) {
				
				sum += quantities[ i ];
				
			}
		}
		
        if ( sum > 100 ) {
        	
        	System.out.println( "Stock is good" );
        	
        }
        else if ( sum > 50 && sum < 100 ) {
        	
        	System.out.println( "Stock is moderate" );
        	
        }
        else if ( sum < 50 && sum != 0 ) {
        	
        	System.out.println( "Stock is running low" );
        	
        }
	}
}