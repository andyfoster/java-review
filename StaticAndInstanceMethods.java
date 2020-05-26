package net.andyfoster;

public class StaticAndInstanceMethods {
	public static void main(String[] args) {
		printS("static method"); //	== Example.printS("static method")
		
		StaticAndInstanceMethods myReview = new StaticAndInstanceMethods();
		myReview.print("instance method");
	}
	
	void print(String data) {
		System.out.println(data);
	}
	
	static void printS(String data) {
		System.out.println(data);
	}
}