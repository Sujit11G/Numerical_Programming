package com.jsp.Logical;

import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int m=n;
		int sum=0;
		int i=1;
		
		while(n!=0) {
			int d=n%8;
			sum=sum+i*d;
			i=i*10;
			n=n/8;
		}
		System.out.println(sum+" is Octal value of "+m);

	}
}
