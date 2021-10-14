package com.algorithmprograms;

import java.util.Scanner;

public class CustomizeMessage {
	private static void check(String fname, String lname, String num) {
		if ((fname != null && lname != null) && (fname.matches("^[a-zA-Z]*$") && lname.matches("^[a-zA-Z]*$"))) {
			System.out
					.println("Hello " + fname + ", We've your Full Name as " + fname + " " + lname + " in our System.");
		}
		if (num.matches("\\d{10}")) {
			System.out.println("Your Contact Number is " + num
					+ "Please, let us know in case of any clarification Thank you BridgeLabz 13/10/2021. \"");
		} else {
			System.out.println("Number Didn't Match to the criteria");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Hello Renu, We've your Full Name as Renu Chandraker in our System Your Contact Number is 91-9748176894 Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ");

		System.out.println();
		System.out.println("Enter First Name");
		String fname = sc.next();
		System.out.println("Enter Last Name: ");
		String lname = sc.next();
		System.out.println("Enter Your Phone Number");
		String number = sc.next();

		check(fname, lname, number);
	}
}
