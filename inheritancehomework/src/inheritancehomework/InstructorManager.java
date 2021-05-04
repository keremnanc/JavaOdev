package inheritancehomework;

public class InstructorManager extends UserManager{
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.firstName + " , " + instructor.instructorCourseName + " Adlý kursu yayýnladý");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " , " + instructor.instructorCourseName + " Adlý kursu yayýndan kaldýrdý");
	}
}
