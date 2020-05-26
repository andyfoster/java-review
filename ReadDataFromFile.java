package net.andyfoster;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		Path file = FileSystems.getDefault().getPath("", "myFile.txt");
		List<String> lines = Files.readAllLines(file);
		
		// METHOD 1
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
		
		// METHOD 2
		lines.forEach((str) -> System.out.println(str));
		
		// METHOD 3
		// pass reference to method that receives a string
		lines.forEach(System.out::println); 
	}

}
 