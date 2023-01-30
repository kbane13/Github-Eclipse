package com.aurionpro.test;

import java.util.Scanner;

public class Convertno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Converting a no into binary,octal,hexadecimal");
		System.out.println("enter your number");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		System.out.println( "Binary value of " +n+ " is " +binary);
		String hex=Integer.toHexString(n);
		System.out.println("hexadecimal value of " +n+ " is " +hex);
		String octal=Integer.toOctalString(n);
		System.out.println("octal value of " +n+ " is " +octal);
	}

}
