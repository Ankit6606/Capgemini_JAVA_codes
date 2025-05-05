package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<Person> c = Person.class;
		Package pack  = c.getPackage();
		System.out.println(pack);
//		
		//trying to access the private non parameterized constructor by using getConstructor()
//		Constructor<Person> con = c.getConstructor();//The non parameterized constructor is private so this will throw a runtime exception(NoSuchMethodException)
//		System.out.println(con);
		/*As the private non parameterized constructor can't be accessed by getConstructor() method, we use the method named
		 as getDeclaredConstructor()   */
//		
		//Will return any non parameterized constructor(public, private or default)
		Constructor<Person> cons1 = c.getDeclaredConstructor();
		System.out.println(cons1);
		cons1.setAccessible(true);//Setting the private Constructor as public
		Person p1 = cons1.newInstance();//Accessing the private Constructor by creating the object
//		System.out.println(p1);
		
		//Will only return the public parameterized constructor
		Constructor<Person> cons = c.getConstructor(String.class, int.class);
		System.out.println(cons);
		Person p2 = cons.newInstance("Ankit", 23);//Accessing the parameterized constructor
		System.out.println(p2);
		
		//Will return only the public Constructors as an array
		Constructor<?>[] c1 = c.getConstructors();
		for (Constructor<?> constructor : c1) {
			System.out.println(constructor);
		}
				
		//Will return all the Constructors(public, private, default) as an array
		Constructor<?>[] c2 = c.getDeclaredConstructors();
		for (Constructor<?> constructor : c2) {
			System.out.println(constructor);
		}
		
		//Will only return the public methods of the class as array
		Method[] public_methods = c.getMethods();
		for (Method method : public_methods) {
			System.out.println(method);
		}
		
		//Will return all the level methods(public , default, private) of the same class as array
		Method[] all_methods = c.getDeclaredMethods();
		for (Method method2 : all_methods) {
			System.out.println(method2);
		}
		
		//To get all the methods of the superclass of Person class which is Object class
		@SuppressWarnings("unchecked")
		Class<Object> c3 = (Class<Object>) c.getSuperclass();
		Method[] all_public_methods = c3.getDeclaredMethods();
		for (Method method : all_public_methods) {
			System.out.println(method);
		}
		
		Person p = new Person("Ankit", 23);
		Method m1 = c.getDeclaredMethod("getDetails");//will get all types of non parameterized methods(public, private, default), in the bracket its the name of the method
		System.out.println(m1);
		//Invoke method is used to access the methods
		String s = (String) m1.invoke(p);//pass the object reference to invoke method for non static methods
		System.out.println(s);
		
		Method m2 = c.getDeclaredMethod("task", String.class, int.class);//Have to pass the method name and the type of arguments
		System.out.println(m2);
		m2.setAccessible(true);//accessing the private method
		m2.invoke(null, "Ankit", 23);// pass the actual arguments and null for static methods
		
		
		Field[] all_var = c.getDeclaredFields();//Get all the variables of the class as an array
		for (Field field : all_var) {
			System.out.println(field);
		}
		
		Field f = c.getDeclaredField("name");//Get a particular variable with its name mentioned in the argument section
		System.out.println(f);
		
	}
}
