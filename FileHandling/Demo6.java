package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo6 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\ANKIT\\Documents\\Filehandling_JAVA\\xyz.txt");
		pw.println(true);
		pw.println(10.8);
		pw.println("hi");
		pw.println('a');
		pw.println(1000);
		pw.flush();
		System.out.println("Data Done");
	}
}
