package Annotation2;

public class Task {
	@Roles("user")
	public void userTask() {
		System.out.println("User task");
	}
	@Roles("admin")
	public void adminTask() {
		System.out.println("Admin task");
	}
}
