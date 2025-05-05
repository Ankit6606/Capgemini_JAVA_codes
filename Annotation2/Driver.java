package Annotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of role");
		String roleType = sc.next();
		System.out.println("Enter the task");
		String task = sc.next();
		Task t = new Task();
		userValidCheck(roleType, task, t);
		
	}
	
	public static void userValidCheck(String role_by_user, String method_name, Task t) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Class<Task> c = Task.class;
		Method m = c.getMethod(method_name);
		if(m.isAnnotationPresent(Roles.class)) {
			Roles roles = m.getAnnotation(Roles.class);
			if(roles.value().equals(role_by_user)) {
				m.invoke(t);
			}
			else {
				System.out.println("Role not valid..Don't have access");
			}
		}
	}
}
