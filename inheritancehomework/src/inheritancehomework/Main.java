package inheritancehomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor user1 = new Instructor(1,"Engin","Demiroğ", "engindemiroğ@hotmail.com","JAVA DERS");
		Student user2 = new Student(2,"Kerem","İnanç","keremnanc@gmail.com", 23);
		UserManager userManager = new UserManager();
		userManager.login(user1);
		userManager.login(user2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(user2);
	}

}
