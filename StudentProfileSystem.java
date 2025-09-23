class student {

    private int rollNo,percentage;
	private String name;
	
	public void setRollNo( int rollNo ) {
		
		this.rollNo = rollNo;
		
	}
	
	public int getRollNo() {
		
		return rollNo;
		
	}
	
   public void setPercentage( int percentage ) {
	   
	   this.percentage = percentage;
	   
   }
   
   public int getPercentage() {
	   
	   return percentage;
	   
   }
   
   public void setName( String name ) {
	   
	   this.name = name;
	   
   }
   
   public String getName() {
	   
	   return name;
	   
   }
}

public class StudentProfileSystem {

	public static void main(String[] args) {
		
		student Student1 = new student();
		Student1.setRollNo( 33 );
		Student1.setPercentage( 99 );
		Student1.setName( "Akshay" );

		System.out.println( "Name of the student is : " + Student1.getName() + "\nStudent roll number is : " + Student1.getRollNo() + "\nStudent percentage is : " + Student1.getPercentage() );		
        
	}
}