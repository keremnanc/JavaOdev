package inheritancehomework;

public class Instructor extends User{
	String instructorCourseName;

	public Instructor(int id, String firstName, String lastName, String email, String instructorCourseName) {
		super(id, firstName, lastName, email);
		this.instructorCourseName = instructorCourseName;
	}

	
}
