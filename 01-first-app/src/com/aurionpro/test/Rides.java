package com.aurionpro.test;

import java.util.Scanner;

public class Rides {

	public static void main(String[] args) {
		int Totalfair = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter your height");
		int height = sc.nextInt();
		if (height > 120) {
			System.out.println("Can ride");
			System.out.println("please enter you age");
			int age = sc.nextInt();
			if (age < 12) {
				Totalfair = 5;
			} else if (age >= 12 && age <= 18) {
				Totalfair = 7;
			} else if (age >= 18 && age <= 44) {
				Totalfair = 12;
			} else if (age >= 45 && age <= 55) {
				Totalfair = 3;
			}
			System.out.println("Want Photo:yes/no");
			String photo = sc.next();
			if (photo.equalsIgnoreCase("Yes")) {
				Totalfair += 3;
				System.out.println("Your final bill is $" + Totalfair);
			} else {
				System.out.println("The total bill is " + Totalfair);
			}

		} else {
			System.out.println("Cant ride");
		}
	}

}
