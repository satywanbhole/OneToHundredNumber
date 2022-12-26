package com.string;

public class SubString {

	public static boolean check(String s1, String s2, int a, int b) {

		for (int i = 0; i < b; i++) {// i=0 ,i=1

			for (int j = 0; j < a; j++) { //  j=0, j=0

				if (s2.charAt(i) == s1.charAt(j)) // s == s, a==s, a==a,
					break; // for s==s
				if (j == b) //(a==s)->(0==7)

					return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		String s1 = "satywanBhole";
		String s2 = "satywan";
		int a = s1.length();
		int b = s2.length();

		if (check(s1, s2, a, b)) {
			System.out.println("S2 is SubString of S1");
		} else {
			System.out.println("S2 is Not SubString of S1");
		}
	}

}
