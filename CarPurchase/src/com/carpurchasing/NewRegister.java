package com.carpurchasing;

public class NewRegister {

	public static void newRegistration() {
		System.out.println("Welcome to Registration Page");
		System.out.println();
		System.out.println("Please Enter your Name");
		String newName = MainClass.scan.next();
		System.out.println();
		RegisteredUser.usersList.add(newName);
		System.out.println();
		System.out.println("You are successfully Registered");
		System.out.println();
		UserChecking check = new UserChecking();
		check.userChecking();

	}

}
