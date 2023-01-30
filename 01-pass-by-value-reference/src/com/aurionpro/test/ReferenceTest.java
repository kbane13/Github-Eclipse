package com.aurionpro.test;

import com.aurionpro.model.Circle;

public class ReferenceTest {
	public static void main(String[]args) {
		Circle circle=new Circle();
		circle.radius=10;
		ConvertRadiusToZero(circle);
		System.out.println(circle.radius);
	}

	private static void ConvertRadiusToZero(Circle cir) {
		// TODO Auto-generated method stub
		cir.radius=0;
		
	}

}


