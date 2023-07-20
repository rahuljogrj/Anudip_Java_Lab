package Online_food_order;

import java.util.Scanner;

public class Drinks extends Main_food_class {


	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	
	
//	Drinks menus with price
	public void drinks() {
		a = "Lassi";
		b = "Coca-cola";
		c = "Pepsi";
		d = "Sprite";
		
		u = 180;
		v = 160;
		w = 150;
		x = 160;
		
		System.out.println("Select Drinks items: ");
		System.out.println("A: "+a +"\t\tRs."+u);
		System.out.println("B: "+b +"\t\tRs."+v);
		System.out.println("C: "+c +"\t\tRs."+w);
		System.out.println("D: "+d +"\t\tRs."+x);
		
		select_menu_item();

	}
	

}
