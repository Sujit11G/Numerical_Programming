package com.jsp.Logical;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binay number");
		int n=sc.nextInt();
		
		int m=n;
		int i=1;
		int sum=0;
			
		while(n!=0) {
			int d=n%10;
			sum=sum+d*i;
			i=i*2;
			n=n/10;
		}
		System.out.println(sum+" is binay code of "+m);
		
	}
}
 