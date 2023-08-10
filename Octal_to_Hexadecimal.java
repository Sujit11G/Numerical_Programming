package com.jsp.Logical;

import java.util.Scanner;

public class Octal_to_Hexadecimal {

	public static void main(String[] args) {
		char hexa[]=new char[100];
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
		}System.out.println(sum);
		
		n=sum;
		int j=0;
		
		while(n!=0) {
			int f=n%16;
			if(f<10)
				hexa[j++]=(char)(48+f);
			else
				hexa[j++]=(char)(55+f);	
			n=n/16;
		}
		System.out.print("hexadecimal value of "+m+" = ");
		for(int k=j-1;k>=0;k--) {
			System.out.print(hexa[k]);
		}

	}
}
