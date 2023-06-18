package com.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=132;
		int reverse =0;
		while(number !=0) {
			reverse=number%10;
			System.out.print(reverse);
			number=number/10;
		}

	}

}
