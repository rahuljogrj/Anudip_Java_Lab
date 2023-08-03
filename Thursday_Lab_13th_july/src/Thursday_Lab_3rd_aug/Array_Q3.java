/*
 Write a program that asks the user to input ten integers and stores them in an array.
 The program should then find and print the smallest and largest values in the array.
 */

package Thursday_Lab_3rd_aug;

import java.util.Scanner;

public class Array_Q3 {

	// declare variables and array
	int[] arr;
	int i, grt, smt;
	Scanner sc = new Scanner(System.in);

	// Main function.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Q3 obj = new Array_Q3();
		obj.grt();
		obj.smt();
	}

	// input values from user
	public int[] arr_value() {
		arr = new int[10];
		System.out.println("Enter 10 number in array: ");

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void array() {
		arr = arr_value();
	}

//find greater number from array
	public void grt() {
		array();
		grt = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (grt < arr[i]) {
				grt = arr[i];
			}
		}

		System.out.println("\nThe greatest number in array is: " + grt + "\n");

	}

	// find smaller number from array
	public void smt() {
		smt = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (smt > arr[i]) {
				smt = arr[i];
			}
		}

		System.out.println("\nThe greatest number in array is: " + smt + "\n");

	}

}
