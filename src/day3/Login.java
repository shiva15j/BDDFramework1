package day3;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");

		String username = sc.next();

		System.out.println("Pin=:");

		int pin = sc.nextInt();

		if (username.equals("Shivam") && pin == 1234) {
			System.out.println("Login Succesfull");
		}

		else if (username.equals("Vivek") && pin == 3456) {
			System.out.println("Login Succesfull");
		}

		else {
			System.err.println("Invalid Credentials");
		}

	}

}
