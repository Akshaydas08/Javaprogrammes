import java.util.Scanner;

public class GradesOfStudents {
    public static void main(String[] args) {
    Scanner numbers = new Scanner( System.in );
		
		System.out.println( "Enter your marks  " );
		
		int marks[] = new int[ 5 ];
				
              System.out.println( "English : " );
              marks [ 0 ] = numbers.nextInt();
              System.out.println( "Malayalam : " );
              marks [ 1 ] = numbers.nextInt();
              System.out.println( "Maths : " );
              marks [ 2 ] = numbers.nextInt();
              System.out.println( "Computer science : " );
              marks [ 3 ] = numbers.nextInt();
              System.out.println( "Physics : " );
              marks [ 4 ] = numbers.nextInt();
              
              int sum = 0;
              
              int count = 0;
              
              for ( int i = 0;i<marks.length;i++ ) {
            	  
            	  sum += marks[ i ];
            	  count++;
            	  
              }
            
              int average = sum/count;
              
              if ( average >= 90 && average <=100 ) {
            	  
            	  System.out.println( "Your grade is : A" );
            	  
              }
              else if ( average >= 75 && average < 90 ) {
            	  
            	  System.out.println( "Your grade is : B" );
            	  
              }
              else if ( average >=60 && average < 75 ) {
            	  
            	  System.out.println( "Your grade is : C" );
            	  
              }
              else if ( average < 60 ) {
            	  
            	  System.out.println( "Your grade is : D" );
            	  
              }
              else {
            	  
            	        if ( average > 100 ) {
            	        	
            	        	System.out.println( "Please check the marks!" );
            	        	
            	        }
            	        else {
            	        	
            	        	System.out.println( "Something went wrong" );
            	        	
            	        }
              }
            }
        }