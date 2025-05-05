package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {
	public static void main(String[] args) throws IOException {
		String image = "C:\\Users\\ANKIT\\Documents\\Filehandling_JAVA\\batman.jpg";
		Path path = Paths.get(image);
		byte[] byte_array = Files.readAllBytes(path);
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\ANKIT\\Documents\\Filehandling_JAVA\\Demo1\\batman_demo.jpg");
		f.write(byte_array);
		System.out.println("Image saved");
	}
}
