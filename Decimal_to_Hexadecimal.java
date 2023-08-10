package com.jsp.Logical;

import java.util.Scanner;

public class Decimal_to_Hexadecimal {
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		char hexa[] =new char[100];
		System.out.println("Enter any decimal value");
		int n=sc.nextInt();
		
		int m=n; 
		int j=0;
		
		while(n!=0) {
			int d=n%16;
			
			if(d<10) {
				hexa[j++]=(char)(48+d);
			}
			else {
				hexa[j++]=(char)(55+d);
			}
			n=n/16;
		}
		System.out.print("hexadecimal value of "+m+" = ");
		for(int i=j-1;i>=0;i--) {
			System.out.print(hexa[i]);
		}
		
//		  Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter any binary value:");
//	        int decimal = sc.nextInt();
//
//	        String hexadecimal = Integer.to(decimal);
//	        System.out.println("Hexadecimal value of " + decimal + " = " + hexadecimal);
//	        
//	        String octaNumber = sc.nextLine(); // Example binary number
//	        
//	        int decimalNumber = Integer.parseInt(octaNumber, 8);
//	        
//	        System.out.println("Decimal value of "+octaNumber+" = "+decimalNumber);
//	        System.out.println("Decimal: " + decimalNumber);
	}
	
	

	
	   
	      
	    
	



}
