package com.welcome.basicoperations;

import java.util.Scanner;

public class ObjectiveSeven {
	/*
	 * Objective 7 : (while , switch-case)
	Write java application , to accept month no from user , using Scanner
	(Range 1-12 => Jan -Dec)
	Display the name of a season accordingly
	11,12,1,2 : Winter
	3,4,5,6 : Summer
	7,8,9,10 : Monsoon
	The program should exit , with error message , if user enters the invalid month no)

	 */

	public static void main(String[] args) {
		
		int month;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Enter month between 1-12");
			month=sc.nextInt();
			
			if(month<1 || month>12) {
				System.out.println("Enter month withing given range");
				break; //it will brrak the loop and avoiding printing of default block
			}
			
			switch(month) {
			
			case 11:
			case 12:
			case 1:
			case 2:
				System.out.println("Season : winter");
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Season : Summer");
				break;
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Season : Monsoon");
				break;
			
			default: {
				System.out.println("Invalid choice"); //this will not reached
			}
			}
		}while(month>=1 && month<=12); //continuing loop till invalid number
		
		sc.close();
		
	}
	
}
