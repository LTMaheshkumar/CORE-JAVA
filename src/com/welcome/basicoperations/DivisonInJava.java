package com.welcome.basicoperations;

import java.util.Scanner;

public class DivisonInJava {

	public static void main(String[] args) {
		double num1,num2, result;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First numbers: ");
		num1=sc.nextDouble();
		//clear the buffer after taking double input
		System.out.println("Enter another number");
		num2=sc.nextDouble();
		
		result= num1/num2;
		
		System.out.println("Divsion of two numbers is:"+result);

	}

}
