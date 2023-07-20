package Online_food_order;

import java.util.Scanner;

public class Non_veg_course extends Main_food_class {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	
	
//	Non_veg course menus with price
	public void nonveg() {
		a = "Butter chicken";
		b = "Chicken kadhai";
		c = "Chicken korma";
		d = "Chicken biryani";
		e = "Butter Naan";
		f = "Butter Roti";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		y = 120;
		z = 200;
		
		System.out.println("Select Non-Veg items: ");
		System.out.println("A: "+a +"\t\tRs."+u);
		System.out.println("B: "+b +"\t\tRs."+v);
		System.out.println("C: "+c +"\t\tRs."+w);
		System.out.println("D: "+d +"\t\tRs."+x);
		System.out.println("E: "+e +"\t\t\tRs."+y);
		System.out.println("F: "+f +"\t\t\tRs."+z);
		
		select_menu_item();

	}
	
	
}
