package com.jsp.Logical;

public class AverageOfDigits {

	public static float Average(int n) {
		
		
	    int m=n;
		float count =0;
		float sum=0;
		
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		//System.out.println(sum);
		n=m;
		while(n!=0) {
			n=n/10;
			count++;
		}
		//System.out.println(count);
		
	
		
		return (sum/count);
	}
}
