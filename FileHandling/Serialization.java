package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\\\Users\\\\ANKIT\\\\Documents\\\\Filehandling_JAVA\\\\Serialization.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		Employee employee = new Employee(100, "Ankit", 50000);
		o.writeObject(employee);//We will get the encrypted data in the destination file 
		System.out.println("Employee saved to file");
	}
}
