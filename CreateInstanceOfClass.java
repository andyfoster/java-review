package net.andyfoster;

public class CreateInstanceOfClass {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.myMethod();
		mc.myInt = 10; // can modify properties
		System.out.println(mc.myInt);
	}

}
