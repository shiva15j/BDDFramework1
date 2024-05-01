package day44;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Operator=:");

		String operator = sc.next();

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		switch (operator) {
		case "+":
			int sum = num + num1;
			System.out.println("The Sum=:" + sum);

			break;

		case "-":
			int sub = num - num1;
			System.out.println("The Sum=:" + sub);

			break;

		case "*":
			int mul = num * num1;
			System.out.println("The Sum=:" + mul);

			break;

		case "/":
			int div = num / num1;
			System.out.println("The Div=:" + div);

			break;

		default:
			System.out.println("Wrong operation");
			break;
		}

	}

}
