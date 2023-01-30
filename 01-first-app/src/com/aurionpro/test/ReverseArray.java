package com.aurionpro.test;

public class ReverseArray {

	public static void main(String[] args)
	{
		int[] number = {10,20,30,40,50,60,70,80,90};
	     
		  //print array starting from first element
		    System.out.println("before reverse:");
		    for(int i=0;i<number.length;i++)
		         System.out.print(number[i]+" ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("After reverse:");
		         for(int i=number.length-1;i>=0;i--)
		         System.out.print(number[i]+" ");
		    }
		}