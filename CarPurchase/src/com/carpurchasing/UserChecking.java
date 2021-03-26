package com.carpurchasing;

public class UserChecking extends Exception {
	public void userChecking() {
		System.out.println("Please Enter your name ");
		System.out.println();
		String newUser = "";
		try {
			newUser = MainClass.scan.next();
			char[] chars = newUser.toCharArray();
			for (char c : chars) {
				if (Character.isDigit(c)) {
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("Name should not cotanin any numbers");
			UserChecking check = new UserChecking();
			check.userChecking();
		}
		System.out.println();
		if (RegisteredUser.usersList.contains(newUser)) {
			System.out.println("Welcome " + newUser + " To Uma Motors");
			System.out.println();
			CarObjects.availableCars();
		} else {
			System.out.println("You are not a Valid user, Please Register First");
			System.out.println();
			System.out.println("Do you want to register");
			System.out.println();
			System.out.println("Enter character y to continue the process");
			System.out.println();
			char character = MainClass.scan.next().charAt(0);
			if (character == 'y' || character == 'Y') {
				NewRegister.newRegistration();
			} else {
				System.out.println("Thank you..!! Please Try Agian");
				System.exit(0);
			}
		}
	}
}
