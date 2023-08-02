/*
 Overriding: method overriding occurs when a subclass (child class) has the same method as the parent class. 
 			In other words, method overriding occurs when a subclass provides a particular implementation of
 			
 			a method declared by one of its parent
 */

// WAP to perform the operation by using method overriding (swapp 3rd , without third variable)

package Polymorphism;

import java.util.Scanner;

public class Poly_overriding {

	int num1, num2, temp;
	Scanner sc = new Scanner(System.in);
	

	// swap number without third variable
	public void swap_no_twoV() {
		System.out.println("====================================================================");
		System.out.println("\n\n---------- Swap numbers from Poly_overriding  (from obj1)----------\n");
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		System.out.println("The value before swapping num1 and num2: "+num1+"\t"+num2);
		
		num1 = num1+num2;			// 10+20=30=num1
		num2 = num1-num2;			// 30-20=10=num2
		num1 = num1-num2;			// 30-10=20=num1
		
		System.out.println("The value after swapping num1 and num2: "+num1+"\t"+num2);
	}

	
	// swap number with third variable
	public void swap_no_threeV() {
		System.out.println("====================================================================");
		System.out.println("\n---------- Swap numbers with third variable from Poly_overriding_1 (from obj) ----------\n");
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("The value before swapping num1 and num2: "+num1+"\t"+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The value after swapping num1 and num2: "+num1+"\t"+num2);
	}

	
	
}
