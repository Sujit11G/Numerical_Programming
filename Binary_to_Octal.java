package com.jsp.Logical;

import java.util.Scanner;

public class Binary_to_Octal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
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
		System.out.println(sum);
		
		n=sum;
		int j=1;
		int oct=0;
		while(n!=0) {
			int f=n%8;
			oct=oct+f*j;
			j=j*10;
			n=n/8;	
		}
		System.out.println("Octal value of "+m+" = "+oct);
	}
}
