package com.jsp.Logical;

public class Automorphic_No {

	public static boolean isAutomorphic(int n) {
		
		int m=n;
		int sq=n*n;
		int count =0;
		while(n!=0) {
			
			int d=n%10;
			int d1=sq%10;
			
			if(d!=d1) {
				count++;
			}
			n=n/10;
			sq=sq/10;
		}
		
		return count==0;
	}
	
	public static void main(String[] args) {
		
		boolean b=isAutomorphic(25);
		System.out.println(b);
	}
}
