package com.qa.first_app;

public class HelloWorld {
	public static String returnString(String message) {
		return message;
	}
	
	public static void main(String args[]) {
		String message = "Hello World!";
		System.out.println(returnString(message));
	}
}
