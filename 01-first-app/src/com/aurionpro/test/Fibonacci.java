package com.aurionpro.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c;
		System.out.println("Enter Max value to print");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
	}
	

}
