package com.aurionpro.test;

import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter direction left or right");
		String option = sc.nextLine();
		// String(Collection of Character) data format

		// here we check the location is paris or not

		if (option.equalsIgnoreCase("left")) {
			System.out.println("swim or wait");
			option = sc.nextLine();
			if (option.equalsIgnoreCase("wait")) {
				System.out.println("Choose door:blue/red/yellow ");
				option = sc.nextLine();
				if (option.equalsIgnoreCase("Yellow")) {
					System.out.println("You win");
				} else if (option.equalsIgnoreCase("Red")) {
					System.out.println("Burned in fire");
				} else if (option.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by beast");
				} else {
					System.out.println("Game over");
				}
			} else {
				System.out.println("Attack by trout");
			}
		} else {
			System.out.println("fall into a hole");
		}

	}
}
