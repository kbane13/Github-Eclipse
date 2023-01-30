package com.aurionpro.test;

public class PrimeNumbers {

	public static void main(String[] args)
	{
	for(int n=1;n<=100;n++)
		
	{
		boolean IsPrime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				IsPrime=false;
				break;
			}
			
			
			
		}
		if(IsPrime)
		
		System.out.println(n);
	}
	

	}
	
}
		

	


