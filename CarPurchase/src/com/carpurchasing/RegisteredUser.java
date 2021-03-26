package com.carpurchasing;

import java.util.*;

public class RegisteredUser {
	static List<String> usersList = new ArrayList<String>();

	public void users() {
		usersList.add("umamahesh");
		usersList.add("vijaya");
		usersList.add("narsing");
		usersList.add("srinu");
		usersList.add("hemanth");
		usersList.add("pawan");
		usersList.add("usha");
		usersList.add("vidhya");
		UserChecking check = new UserChecking();
		check.userChecking();
	}

}