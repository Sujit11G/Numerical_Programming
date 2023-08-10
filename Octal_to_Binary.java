package com.jsp.Logical;

import java.util.Scanner;

public class Octal_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Octal Number");
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
		System.out.println(sum);
		
		n=sum;
		String s="";
		while(n!=0) {
			int f=n%2;
			s=f+s;
			n=n/2;
		}
		System.out.println("Octal value of "+m+"="+s);
		
		
	}
}
