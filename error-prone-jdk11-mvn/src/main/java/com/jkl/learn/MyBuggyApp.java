package com.jkl.learn;


public class MyBuggyApp {
	
	public static void main(String args[]) throws IllegalAccessException {
		System.out.print("Hello!");
			
		if(args.length==1) {
			new IllegalAccessException();
		}
	}
	
	public static void doNothing() {}

}
