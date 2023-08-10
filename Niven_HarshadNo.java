package com.jsp.Logical;

public class Niven_HarshadNo {

	public static boolean isNivenNo(int n) {
		
		int m=n;
		int sum=0;
		
		while(n!=0) {
			
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return m%sum==0;
	}
	
	public static void main(String[] args) {
		
		boolean b=Niven_HarshadNo.isNivenNo(156);
		
		System.out.println(b);
	}
}
