package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("C:\\\\Users\\\\ANKIT\\\\Documents\\\\Filehandling_JAVA\\\\Serialization.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Employee employee = (Employee) o.readObject();
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}
}
