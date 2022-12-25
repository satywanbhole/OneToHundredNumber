package com.numbers;

public class WithoutUsingAnyMethod {

	public static void main(String[] args) {
		print(100);
		print1(100);
	}

	private static void print(int n) {

		if (n > 0) {
			print(n - 1);
			System.out.print(n + "\t");
		}

	}

	private static void print1(int n) {

		if (n > 0) {

			System.out.println(n + "\t");
			print1(n - 1);
		}
	}

}
