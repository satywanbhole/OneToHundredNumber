package com.string;

public class CheckSubArray {

	public static boolean check(int a[], int b[], int m, int n) {
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j< m; j++) {
				
				if(a[j]==a[i])
					break;
				if(j==n)
					return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		int[] b= {20,30,40,50,80};
		
		int m=a.length;
		int n=b.length;
		
		if(check(a,b,m,n)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
