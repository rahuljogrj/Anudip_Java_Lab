package Online_food_order;

import java.util.Scanner;

public class Starter extends Main_food_class {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {


	}
	
	
	
//	starter menus with price
	public void starter()  {
		
		a = "Chicken chilly";
		b = "Chicken manchurian";
		c = "Chicken lollypop";
		d = "Paneer chilly";
		e = "Veg manchurian";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		y = 120;
		
		System.out.println("Select Starter: ");
		System.out.println("A: "+a +"\t\tRs."+u);
		System.out.println("B: "+b +"\t\tRs."+v);
		System.out.println("C: "+c +"\t\tRs."+w);
		System.out.println("D: "+d +"\t\tRs."+x);
		System.out.println("E: "+e +"\t\tRs."+y);
		
		
		select_menu_item();

	}
	
	


}


