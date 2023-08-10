package com.jsp.Logical;

public class StronNumber {

	public static boolean isStrongNo(int n) {
		
		int sum=0;
		int m=n;
		
		while(n!=0) {
			int d=n%10;
			
			int fact=1;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			
			n=n/10;
		}
		
		return (sum==m);
	}
	
	public static void main(String[] args) {
		
		boolean b=isStrongNo(14);
		System.out.println(b);
	}
}