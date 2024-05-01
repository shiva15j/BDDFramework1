package day3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");
		int l = sc.nextInt();

		System.out.println("Bredth=:");
		int b = sc.nextInt();

		int area = l * b;

		System.out.println(area);

	}

}
