package com.jsp.Logical;

public class XylemPholem {

	public static boolean isXylem(int n) {
		
		int m=n;
		int sum1=0;
		int sum2=0;
		
		while(n!=0) {
			int d=n%10;
			
			if(n==m || n<10 )
				sum1=sum1+d;
			else
				sum2=sum2+d;
			
			n=n/10;
		}
	
		return (sum1==sum2);
	}
	
	public static void main(String[] args) {
		
		boolean t=XylemPholem.isXylem(3432);
		if(t==true) {
			System.out.println("Xylm no");
		}else {
			System.out.println("Pholem no");
		}
	}
}
