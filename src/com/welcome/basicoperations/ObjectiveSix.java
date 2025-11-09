package com.welcome.basicoperations;

import java.util.Scanner;

public class ObjectiveSix {
	/*
	 * Objective 6 : Accept begin n end value from user(using scanner)
	Print all odd numbers in the range.

	 */

	public static void main(String[] args) {
		int num1,num2, inc;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the starting range:");
		num1=sc.nextInt();
		
		System.out.println("Enter the Ending range");
		num2=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Printing the odd numbers in given range is: ");
		for(int i=num1; i<=num2; i++) {
		
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}

	}

}
