package com.jsp.Logical;

public class PrimeNO1to100 {

public static boolean isPrime(int n) {
		
		if(n==1)
			return false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n=100; 
//		for(int i =1;i<=n;i++) {
//			int count=0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count ++;
//				}		
//			}
//			if(count==2)
//				System.out.print(i+" ");
//			
//		}
		
		for(int i= 1;i<=n;i++) {
			
			boolean b=isPrime(i);
			if(b==true)
				System.out.println(i);
			
		}
	}
	
	
}
