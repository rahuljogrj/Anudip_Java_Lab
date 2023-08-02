/*
 
 Overloading:- same function name with different parameters or orders of arguments. is a compile time polymorphism.
 			   because this throw error before run.
 			   
 */

// WAP to perform the method overloading for greater between 2 no, GRT 3 NO greater between array No

package Polymorphism;

import java.util.Scanner;

public class Poly_overloading {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Poly_overloading obj = new Poly_overloading();
		obj.grt(120, 21);
		obj.grt(10, 30, 20);
		obj.grt(null);
		
	}
	

	// Greater number between 2 numbers.
	public void grt(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("Number 1 is greater");
		}
		else {
			System.out.println("Number 2 is greater");
		}
	}
	

	

	// Greater number between 3 numbers.
	public void grt(int n1, int n2, int n3) {
		if (n1 > n2 && n1>n3) {
			System.out.println("Number 1 is greater");
		}
		else if (n2 > n1 && n2>n3){
			System.out.println("Number 2 is greater");
		}
		else {
			System.out.println("Number 3 is greater");
		}
	}


	

	// Greater number in Array.
	public void grt(int[] arr) {
		arr = new int[5];
		
		System.out.println("Enter Array values : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int grt_no = arr[0];
		
		for(int j =0; j<arr.length; j++) {
			if(grt_no<arr[j]) {
				grt_no = arr[j];
			}	
		}
		
		System.out.println("The greater value from array is: "+grt_no);
		
	}

}
