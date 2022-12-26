package com.variable;

public class SwapingWithoutThirdVariableString {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before" + " a : " + a + " b : " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After " + " a : " + a + " b : " + b);

		String s1="akshay";
		String s2="bhole";
		System.out.println("Before" + " s1 : " + s1 + " s2 : " + s2);
		
		s1=s1+s2;
		System.out.println(s1); //akshaybhole
		
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After " + " s1 : " + s1 + " s2 : " + s2);
		
	}

}
