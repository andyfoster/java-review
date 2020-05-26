package net.andyfoster;

public class IterateThroughArray {
	
	public static void main(String[] args) {
		String[] breakfast = new String[3];
		breakfast[0] = "Eggs";
		breakfast[1] = "Milk";
		breakfast[2] = "Toast";
		
		for (int i = 0; i < breakfast.length; i++) {
			System.out.println(breakfast[i]);
		}
	}	
}
