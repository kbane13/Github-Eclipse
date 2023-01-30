package com.aurionpro.test;

public class OverLoad {

	public static void main(String[] args) {
		PrintInfo(2);
		PrintString("Krutika");
		Printdouble(8.9);
		Printboolean(2>1);
	}

	




	private static void Printboolean(boolean b) {
		// TODO Auto-generated method stub
		System.out.println(b);
	}






	private static void Printdouble(double d) {
		System.out.println(d);
		
	}



	private static void PrintString(String string) {
		System.out.println(string);
		
	}

	private static void PrintInfo(int i) {
	 System.out.println(i);
		
	}

}
