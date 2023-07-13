/*
 Q3)WAP to perform the following operation 
     1:Accept age and check eligible for voting or not
	2:Accept 3 no from the user and find out the greatest
	3:WAP to accept a no from the user and check it is even or odd
 */



package Thursday_Lab_13th_july;

import java.util.Scanner;

public class Condtional_tasks {

	public static void main(String[] args) {

//		initializing variables
		int age, num1, num2, num3, choice;
		char repeat;

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1: check you are eligible for voting or not \n2: Enter 3 number and Find greatest number. \n3: check number is even or odd");
		
		
		
//		do while for repetition
		do {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			
			
			switch(choice) {
			
		//		1:Accept age and check eligible for voting or not
				case 1:{
					
					System.out.println("enter your age: ");
					age = sc.nextInt();
					
//					to check age is greater than 18 or not
					if(age>18) {
						System.out.println("You are eligible for voting because you are Adult.");
					}
					else {
						System.out.println("You are not eligible for voting because you are not Adult.");
					}
					break;
				}
				
					
		//		2:Accept 3 no from the user and find out the greatest
				case 2:{
						System.out.println("\nEnter any three numbers: ");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
					 num3 = sc.nextInt();
					 
					 
//					 to check which number is greater
					 if(num1>num2 && num1>num3) {
						 System.out.println("Num 1 is Greater");
						 
					 }
					 else if(num2>num1 && num2>num3) {
						 
						 System.out.println("Num 2 is Greater");
						 	 
					 }
					 else {
						 System.out.println("Num 3 is Greater");
							
					 }
					 break;
				} 
			 
			 
		//	 3: WAP to accept a no from the user and check it is even or odd
				case 3:{
					
					 System.out.println("\nEnter single number check even or odd");
					 num1 = sc.nextInt();
					 
//					 to check no is even or not
					 if(num1%2 == 0) {
						 System.out.println("your number "+num1+ " is even");
					 }
					 else {
						 System.out.println("your number "+num1+ " is odd");
					 }
					 break;
					}
				
				
			
				default:{
					System.out.println("invalid inpuit");
				}
			 
			
			}
			
			
			System.out.println("\n\nDo you want to perform another operation...(y / n):");
		 repeat = sc.next().charAt(0);
			
			
		}while(repeat == 'Y' || repeat == 'y');
		
		
		System.out.println("Thank you... END");
		
		
		
		
		
		
		
	
	 
	}

}
