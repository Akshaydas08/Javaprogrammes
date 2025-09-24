class course {
	
	String courseName;
	int duration,noOfStudent;
	final static String courseCreatorName = "Mashupstack";
    static int totalNoOfStudents;
	
	course( String courseName,int duration,int noOfStudent ) {
		
		this.courseName = courseName;
		this.duration = duration;
		this.noOfStudent = noOfStudent;
	    totalNoOfStudents += noOfStudent;
		
	}
	
	static class platform {
		
		public void platformMethod() {
		
		System.out.println( "Courses are hosted on " + courseCreatorName );
		
		}
	}
	
}

public class CourseTest {

	public static void main(String[] args) {
		
		course course1 = new course( "Computer Science",5,72 );
		course course2 = new course( "Electronics",5,81 );
		course.platform nestedOne = new course.platform();
		
		System.out.println( "First course " + course1.courseName + " with " + course1.duration + " years of duration at "  + course1.courseCreatorName + " contains " + course1.noOfStudent + " students." );
        System.out.println( "Second course " + course2.courseName + " with " + course2.duration + " years of duration at " + course2.courseCreatorName + " contains " + course2.noOfStudent + " students." );
		System.out.println( "Total number of students at " + course2.courseCreatorName + " : " + course2.totalNoOfStudents );
		nestedOne.platformMethod();
		
	}
}