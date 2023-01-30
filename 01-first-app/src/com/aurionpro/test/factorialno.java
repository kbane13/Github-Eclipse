package com.aurionpro.test;
import java.util.Scanner;
public class factorialno {

	public static void main(String[] args) {
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
			
		}
		System.out.println("factorial of "+n+ " is " +factorial);
	}

}
