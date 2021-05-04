package inheritancehomework;

public class StudentManager {
	public void joinCourse(Student student) {
		System.out.println(student.firstName + student.lastName + " KATILDI");
	}
	public void leaveCourse(Student student) {
		System.out.println(student.firstName + student.lastName + " AYRILDI");
	}
}
