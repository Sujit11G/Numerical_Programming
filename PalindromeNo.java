package com.jsp.Logical;

public class PalindromeNo {

	public static boolean isPalindrome(int n) {
		
		int m=n;
		int sum=0;
		
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;	
		}
		
		return sum==m;
		
	}
}
