package day4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");
		String Username = sc.next();

		System.out.println("Pin=:");

		int pin = sc.nextInt();

		if (Username.equals("Shivam") && pin == 1234) {
			System.out.println("Login Sucessfull");
		} else if (Username.equals("Ashutosh") && pin == 4567) {
			System.out.println("Login Sucessfull");
		} else if (Username.equals("Dheeraj") && pin == 6789) {
			System.out.println("Login Sucessfull");
		} else {
			System.err.println("Invalid Credentials");
		}

	}

}
