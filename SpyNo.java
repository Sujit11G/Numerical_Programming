package com.jsp.Logical;

public class SpyNo {

	public static boolean spyNo(int n) {
		
		int m=n;
		int pro=1;
		int sum=0;
		
		while(n!=0) {
			
			int d=n%10;
			sum=sum+d;
			pro=pro*d;
			n=n/10;
		}
		return pro==sum;
	}
	
	public static void main(String[] args) {
		
		boolean b=spyNo(123);
		
		System.out.println(b);
	}
}
