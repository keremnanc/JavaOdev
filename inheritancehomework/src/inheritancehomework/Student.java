package inheritancehomework;

public class Student extends User {
	int courseNumber;

	public Student(int id, String firstName, String lastName, String email, int courseNumber) {
		super(id, firstName, lastName, email);
		this.courseNumber = courseNumber;
	}
	
}
