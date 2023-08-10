package com.jsp.Logical;

public class HappyNo {

	public static boolean isHappy(int n) {
		
		int m=n;
		int sum=0;
		
		
		while(n>9) {
			
			while(n!=0) {
				int d=n%10;
				sum=sum+(d*d);
				n=n/10;	
			}
			n=sum;
			sum=0;
			
		}
		m=n;
		return (m==1);
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			boolean b=isHappy(i);
			if(b==true)
			System.out.println(i);
			
		}
		
	}
}
