package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\Users\\ANKIT\\Documents\\Filehandling_JAVA\\Demo1");
//		boolean b = f.mkdir();
//		System.out.println(b);
//		File f1 = new File("C:\\Users\\ANKIT\\Documents\\Filehandling_JAVA\\Demo1\\Demo.txt");
//		boolean b1 = f1.createNewFile();
//		System.out.println(b1);
		File f2 = new File("C:\\\\Users\\\\ANKIT\\\\Documents\\\\Filehandling_JAVA\\\\Demo1");
		String[] list = f2.list();
		System.out.println(Arrays.toString(list));
		
	}
}
