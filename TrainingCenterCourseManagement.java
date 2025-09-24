class course {
	
	String name;
	int duration;
	static int noOfCourses;
	final String trainingCenterName = "Mashupstack";
	
	course() {
		
		this.name = "Computer Science";
		this.duration = 5;
		noOfCourses++;
		
	}
	
	course( String name,int duration ) {
		
		this.name = name;
		this.duration = duration;
	    noOfCourses++;
		
	}
	
	class courseMaterial {
		
		public void materialMethod() {
			
			System.out.println( "Materials provided for this course" );
			
		}
	}
	
}

public class TrainingCenterCourseManagement {

	public static void main(String[] args) {
		
		course course1 = new course( "BCA",5 );
		course course2 = new course( "Machine Learning",5 );
		course course3 = new course();
		
		System.out.println( "Course " + course1.name + " is " + course1.duration + " year duration course at " + course1.trainingCenterName );
        System.out.println( "Course " + course2.name + " is " + course2.duration + " year duration coourse at " + course2.trainingCenterName );
		System.out.println( "Course " + course3.name + " is " + course3.duration + " year duration course at " + course3.trainingCenterName );
        
		course.courseMaterial materials = course2.new courseMaterial();
		
		materials.materialMethod();
		
	}
}