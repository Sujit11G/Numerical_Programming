package com.jsp.Logical;

import java.util.Scanner;

public class Octal_to_Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Ocatl Number");
		int n=sc.nextInt();
		int m=n;
		int i=1;
		int sum=0;
			
		while(n!=0) {
			int d=n%10;
			sum=sum+d*i;
			i=i*8;
			n=n/10;
		}
		System.out.println(sum+" is Octal Code of "+m);
	}
}


