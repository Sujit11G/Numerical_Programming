package com.jsp.Logical;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int m=n;
		String s="";
		
		while(n!=0) {
			int d=n%2;
			s=d+s;
			n=n/2;
		}
		System.out.println(s);
		
	}
}
