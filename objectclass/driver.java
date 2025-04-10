
package objectclass;

public class driver {
	public static void main(String[] args) {
		student s= new student(1, "Ankara Messi", 61.3);
		student s2= new student(2, "Siuu Ronaldo", 56.1);
		System.out.println(s.equals(s2));
		System.out.println(s.toString());
		System.out.println(s2.toString());
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
				
	}

}
