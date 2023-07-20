package Online_food_order;

import java.util.Scanner;

public class Deserts extends Main_food_class{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	

	}
	
	
//	Deserts menus with price
	public void desert() {
		a = "Jalebi";
		b = "Gulab jamun";
		c = "Rasgulla";
		d = "Rabri";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		
		System.out.println("Select Desert items: ");
		System.out.println("A: "+a +"\t\tRs."+u);
		System.out.println("B: "+b +"\t\tRs."+v);
		System.out.println("C: "+c +"\t\tRs."+w);
		System.out.println("D: "+d +"\t\tRs."+x);
		
		select_menu_item();

	}
	

}
