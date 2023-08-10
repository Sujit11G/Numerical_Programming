package com.jsp.Logical;

public class DiseriumNumber {

	public static boolean isDiseriumNo(int n) {
		
		int sum=0;
		int count =0;
		int m=n;
		
		
		while(n!=0) {
			n=n/10;
			count++;
		}
		n=m;
	
		while(n!=0) {
			int d=n%10;
			int pow=1;
			for(int i=1;i<=count;i++) {
				pow=pow*d;
				
			}sum=sum+pow;
			count--;
			n=n/10;
		}
		return sum==m;
	}
public static void main(String[] args) {
		
		boolean b=isDiseriumNo(518);
		System.out.println(b);
	}
}
