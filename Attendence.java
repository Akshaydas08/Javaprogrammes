import java.time.LocalDateTime;
import java.util.Scanner;

public class Attendence {
    public static int averageMark ( int[] marksOfStudents ) {
		   
		   int sum = 0;
		   
		   for ( int i = 0;i<marksOfStudents.length;i++ ) {
			   
			   sum += marksOfStudents[ i ];
			   
		   }
		   int average = sum/marksOfStudents.length;
		   return average;
	   }
	
	public static void main(String[] args) {
		
		Scanner number = new Scanner( System.in );
		
		System.out.print( "Enter the total number of students : " );
		
		int numberOfStudents = number.nextInt();
		
		number.nextLine();
		
		int marksOfStudents[] = new int[ numberOfStudents ];
		
		String namesOfStudents[] = new String[ numberOfStudents ];
		
		System.out.print( "Enter the names of students " );
		
		for ( int i = 0;i<numberOfStudents;i++ ) {
			
			System.out.print( "Student" + ( i + 1 ) + " name : " );
			namesOfStudents[ i ] = number.nextLine();
            System.out.println();
            number.nextLine();
				
            System.out.print( "Student" + ( i + 1 ) + " mark : " );
            marksOfStudents[ i ] =number.nextInt();
            number.nextLine();
            
		}
		
		    System.out.println( "Student details" );
		
	   for( int i = 0;i<numberOfStudents;i++ ) {
		   
		   System.out.println( namesOfStudents [ i ] + " " + marksOfStudents [ i  ] + "\n"  );
		   
	   }
	   
	   for ( int i = 0;i<numberOfStudents;i++ ) {
		   
		   
		   if ( marksOfStudents[ i ]<50 ) {
			   
			   System.out.println( namesOfStudents [ i ] + " needs improvement\n" );
			   
		   } 
	   }
	   
	   int average = averageMark( marksOfStudents );
       System.out.println( "===============" );
	   System.out.println( "The average mark is : " + average );
	   System.out.println( "===============" );
	   LocalDateTime currentDateTime = LocalDateTime.now();
	   System.out.println( currentDateTime );
	   
	   number.close();
	}
}