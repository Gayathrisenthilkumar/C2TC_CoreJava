package day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = a+b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a+b;
		
		System.out.println("Addition of two variables:" + a +",b=" + b + " is" + c);
		
	}

}
