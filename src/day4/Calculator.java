package day4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Arthemetic Operator=:"); 

		String operator = sc.next();

		System.out.println("Num=:");
		int num = sc.nextInt();

		System.out.println("Num1=:");
		int num1 = sc.nextInt();

		switch (operator) {
		case "+":
			int sum = num + num1;
			System.out.println("Sum=:" + sum);

			break;

		case "-":
			int sub = num - num1;
			System.out.println("Sub=:" + sub);

			break;
		case "*":
			int mul = num * num1;
			System.out.println("Mul=:" + mul);

			break;

		case "/":
			int div = num / num1;
			System.out.println("Div=:" + div);

			break;

		default:
			System.out.println("Wrong operaton");
			break;
		}

	}

}
