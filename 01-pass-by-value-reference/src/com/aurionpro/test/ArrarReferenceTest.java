package com.aurionpro.test;

public class ArrarReferenceTest {

	public static void main(String[] args) {
		int[] number= {10,20,30};
		convertArraytoZero(number);
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
	}

	private static void convertArraytoZero(int[] number) {
		
		for(int i=0;i<number.length;i++) {
			number[i]=0;
		
			
		}
	}

}
