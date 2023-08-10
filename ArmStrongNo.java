package com.jsp.Logical;

public class ArmStrongNo {

	public static boolean isArmStrong(int n) {
		
		int count=0;
		int sum=0;
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
			}
			sum=sum+pow;
			n=n/10;
			
		}
		return sum==m;
	}
	
	public static void main(String[] args) {
		
		boolean b=ArmStrongNo.isArmStrong(153);
		
		System.out.println(b);
	
	}
}
