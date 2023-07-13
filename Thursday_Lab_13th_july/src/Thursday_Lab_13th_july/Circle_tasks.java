package Thursday_Lab_13th_july;

import java.util.Scanner;

public class Circle_tasks {

	public static void main(String[] args) {
		

//		initializing the variables for circle
		Double Radius, Area_circle, Circumference;
		
//		define pi value 
		Double pi = 3.14;
		
//		for input from user
		Scanner sc = new Scanner(System.in);
		
		
//		message for client to enter radius
		System.out.println("Enter the value of radius in cm:- ");
		Radius = sc.nextDouble();
		
		
//	Area of circle	
		Area_circle = pi*Radius*Radius;
		System.out.println("Area of Circle: "+ Area_circle +" Sq.cm");
		

//	Circumference of Circle	
		Circumference = 2*pi*Radius;
		System.out.println("Circumference of Circle: "+ Circumference +" cm");
		


	}

}
