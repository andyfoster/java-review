package net.andyfoster;

public class Conditional {
	public static void main(String[] args) {
		boolean statement1 = 1 == 10;
		boolean statement2 = 1 < 3;
		
		if (statement1 && statement2) {
			System.out.println("both statements are true");
		} else {
			System.out.println("at least one statement is false");
		}
	}
}

