package com.aurionpro.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n, temp, length = 0, result = 0, reminder, power, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {

			n = n / 10;
			length++;
		}
		n = temp;
		while (n > 0) {
			reminder = n % 10;
			power = 1;
			i = 0;
			while (i < length) {
				power = power * reminder;
				i++;
			}
			result = result + power;
			n = n / 10;
		}
		if (result == temp) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("not armstrong");
		}
	}
}