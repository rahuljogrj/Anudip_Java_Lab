package Online_food_order;

import java.util.Scanner;

public class Veg_course extends Main_food_class {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	
//	Veg course menus with price
	public void veg() {
		a = "Paneer masala";
		b = "mix vegetables";
		c = "Paneer korma";
		d = "Fried rice";
		e = "Butter Naan";
		f = "Butter Roti";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		y = 120;
		z = 200;
		
		System.out.println("Select Veg items: ");
		System.out.println("A: "+a +"\t\tRs."+u);
		System.out.println("B: "+b +"\t\tRs."+v);
		System.out.println("C: "+c +"\t\t\tRs."+w);
		System.out.println("D: "+d +"\t\t\tRs."+x);
		System.out.println("E: "+e +"\t\t\tRs."+y);
		System.out.println("F: "+f +"\t\t\tRs."+z);
		
		select_menu_item();

	}
	

}
