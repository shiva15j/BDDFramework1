package day4;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		boolean cond = num == num1;

		System.out.println(cond);

		System.out.println(" ");

		System.out.println("Name=");

		String name = sc.next();

		System.out.println("Name1=");

		String name1 = sc.next();

		boolean cond1 = name.equals(name1);

		System.out.println(cond1);

	}

}
