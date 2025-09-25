import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class BookStoreBasicLogSystem {

	public static void main(String[] args) throws IOException {
		
		try ( FileWriter storeDataWriter = new FileWriter( "input.txt" ); ) {
			
			LocalDate currentTime = LocalDate.now();
			
			String txt = "Book order placed at " + currentTime;
			storeDataWriter.write( txt );
			System.out.println( "File has written" );
			
		}
		
	   catch( IOException a ) {
		   
		   System.out.println( "Couldn't write this file" );
		   
	   }
		
		char[] arr1 = new char[100];
		
	   try (  FileReader storeDataReader = new FileReader( "input.txt" ); ){
		   
		  
		   int lineRead = storeDataReader.read( arr1 );
		   if ( lineRead != -1 ) {
			   
			   System.out.println( new String( arr1, 0 , lineRead ) );
//     		   System.out.println( arr1 );
		       System.out.println( "File read" );

		   }
		   else {
			   
			   System.out.println( "File is empty" );
			   
		   }
	   }
	   
	   catch( FileNotFoundException a ) {
		   
		   System.out.println( "File not found!" );
		   
	   }
	   
		   File storeDataDelete = new File( "input.txt" );
		   boolean value = storeDataDelete.delete();
		   
		   if( value ) {
			   
			   System.out.println( "File is deleted" );
			   
		   }
		   
		   else {
			   
			   System.out.println( "File is not deleted" );
			   
		   }
	   
	}
}