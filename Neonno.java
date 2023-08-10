package com.jsp.Logical;

public class Neonno {

	public static void main(String[] args) {
		
		int n=9;
		int sum=0;
		int pro=1;
		int m=n;
		
		while(n>0) {
			int last=n%10;
			
			pro=pro*n;
			
			sum=sum+last;	
			n=n/10;
		}if(sum==m) {
			System.out.println("Neon");
		}else {
			System.out.println("no");
		}
	}
}
