class Employee {
	
	private String name,department;
	private int idNumber;
	private double salary;
	
	public void setName( String name ) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setDepartment( String department ) {
		
		this.department = department;
		
	}
	
	public String getDepartment() {
		
		return department;
		
	}
	
	public void setIdNumber(int idNumber ) {
		
		this.idNumber = idNumber;
		
	}
	
	public int getIdNumber() {
		
		return idNumber;
		
	}
	
	public void setSalary( double salary ) {
		
		this.salary = salary;
		
	}
	
	public double getSalary() {
		
		return salary;
		
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
	    employee1.setName( "Akshay" );
	    employee1.setDepartment( "Full Stack Developer" );
	    employee1.setSalary( 150000.99 );
	    
	    employee2.setName( "Jhon" );
	    employee2.setDepartment( "Front End Developer" );
	    employee2.setSalary( 100000.89 );
	    
	    System.out.println( "Employee " + employee1.getName() + " working in the department " + employee1.getDepartment() + " have salary " + employee1.getSalary() );
	    System.out.println( "Employee " + employee2.getName() + " working in the department " + employee2.getDepartment() + " have salary " + employee2.getSalary() );
	    
	}
}