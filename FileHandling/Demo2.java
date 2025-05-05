package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\\\ANKIT\\\\Documents\\\\Filehandling_JAVA\\xyz.txt");
		f.write("hi");
		f.write('a');
		f.write(99);
		f.flush();//nothing will be written in the xyz.txt file if flush is not used
		System.out.println("data written");
	}
}
