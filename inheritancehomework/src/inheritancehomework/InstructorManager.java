package inheritancehomework;

public class InstructorManager extends UserManager{
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.firstName + " , " + instructor.instructorCourseName + " Adl� kursu yay�nlad�");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " , " + instructor.instructorCourseName + " Adl� kursu yay�ndan kald�rd�");
	}
}
