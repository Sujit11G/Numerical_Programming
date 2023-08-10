package com.jsp.Logical;

import java.util.Scanner;

public class Remainder {

	//find remainder without using %
	
	public static int remainder(int divdend,int divisor) {
		
		int quotient=divdend/divisor;
		
		int d=divdend-divisor*(quotient);
	
		return(d);	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Dividend");
		int n=sc.nextInt();
		
		System.out.println("Enter a Divisior");
		int m=sc.nextInt();
		
		System.out.println(remainder(n,m));
		
	}
}
