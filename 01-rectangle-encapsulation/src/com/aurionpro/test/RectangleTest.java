package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.Color);
		rect.height=30;
		rect.width=20;
		rect.Color="Purple";
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.Color);
		Rectangle rect2=new Rectangle();
		rect2.height=40;
		rect2.width=30;
		System.out.println(rect2.height);
		System.out.println(rect2.width);
		

	}

}
