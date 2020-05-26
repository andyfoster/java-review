package net.andyfoster;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class HandlingErrors {

	public static void main(String[] args) {
		try {
			loadFile("NotMyFile.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	static void loadFile(String filename) throws IOException {
		Path file = FileSystems.getDefault().getPath("", filename);
		List<String> lines = Files.readAllLines(file);
		
		lines.forEach(System.out::println); 	
	}
}