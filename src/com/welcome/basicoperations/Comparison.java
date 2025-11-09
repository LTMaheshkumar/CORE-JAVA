package com.welcome.basicoperations;

import java.util.Scanner;

public class Comparison {
	
	/*
	 * Objective 5 : Accept 2 int values as user input n compare them
	If num1 < num2 , display mesg (1st no is < 2nd no)
	If num1 > num2 , display mesg (1st no is > 2nd no)
	If num1 == num2 , display mesg (1st no is same as 2nd no)

	 */

	public static void main(String[] args) {
		int num1, num2;
		
		//in java we have to intialize the variable, unintialized variables gives an error
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		
		if(num1<num2) {
			System.out.println("Numer "+num1+ " "+"is less than no "+num2);
		}
		else if(num1>num2){
			System.out.println("Number one is greater");
			
		}
		else {
			System.out.println("Both numbers are equals");
		}

	}

}
