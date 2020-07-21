package mj.programs.java8_Practice;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n = input;
		sc.close();
		int reverseNumber = 0;
		int b;
		while (n > 0) {
			b = n % 10;
			n = n / 10;
			reverseNumber = reverseNumber * 10 + b;
		}
		System.out.println("reversed number of " + input + " is " + reverseNumber);
	}
}
