package com.fundamental;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int x = 0;
		// Write a java program given number is palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = num;
		while (num > 0) {

			int lastnum = (num % 10);
			x = (x * 10) + lastnum;
			num = num / 10;
		}
		if (temp == x) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not a Palindrome");
	}
}
