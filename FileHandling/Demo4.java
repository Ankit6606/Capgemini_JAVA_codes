package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\\\ANKIT\\\\Documents\\\\Filehandling_JAVA\\xyz.txt");
		BufferedWriter b = new BufferedWriter(fw);//Only advantage is we can use newLine()
		b.write("hi");
		b.newLine();
		b.write('d');
		b.newLine();
		b.write('z');
		b.flush();
		System.out.println("Data written");
	}
}
