//Q4) WAP to accept a no from the user and find out the factorial
//n*(n-1)*1

package Thursday_Lab_13th_july;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		
//		initializing variable
		int factno, fact;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:  ");
		factno = sc.nextInt();
		
//		declare value 
		fact = 1; 
	

//		while loop for perform factorial
		while(factno>=1) {
			fact = fact*factno; 
			factno--;
		}
		
//		print final Answer
		System.out.println("the factorial is: "+ fact);
		
	}

}
