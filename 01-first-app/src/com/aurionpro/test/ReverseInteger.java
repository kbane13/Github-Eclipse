package com.aurionpro.test;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("enter no to reverse");
		n = sc.nextInt();
		while (n > 0) {
			i = n % 10;
			System.out.print(i);
			n = n / 10;
		}
	}

}
