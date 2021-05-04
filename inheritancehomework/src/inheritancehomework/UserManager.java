package inheritancehomework;

public class UserManager {
	public void login(User user) {
		System.out.println(user.firstName + " " +user.lastName + " Giriþ yaptý");
	}
	public void logout(User user) {
		System.out.println(user.firstName + " " + user.lastName + " çýkýþ yaptý");
	}
}
