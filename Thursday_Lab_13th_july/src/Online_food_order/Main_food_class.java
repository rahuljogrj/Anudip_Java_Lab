
// Run this class file to perform all operation 



package Online_food_order;

import java.util.Scanner;

public class Main_food_class {
	
//	declare maximum variable here for all class..
	
	static String a,b,c,d,e,f;
	static int u,v,w,x,y,z,  sum=0;
	static Scanner sc = new Scanner(System.in);
	static String menu_item="", menu_item1="", menu_item2="", menu_item3="", menu_item4="", menu_item5="" ;
	
	public static void main(String[] args) {
		
//		main method to perform all operation
	System.out.println("\n\n----------xxxx---------- RJ Dhaba ----------xxxx----------\n\n");
		Main_food_class obj = new Main_food_class();
		obj.select_menu();
	}
	
	
	
// function for select menu...
	public void select_menu() {
		System.out.println("Menu card\n ");
		System.out.println("1: Starter \n2: Veg Course \n3: Non-veg Course \n4: Deserts \n5: Drinks");
		System.out.println("\nEnter number from menu you want: ");
		int s = sc.nextInt();
		
		switch(s){
			case 1 :{
				Starter st = new Starter();
				st.starter();
				break;
			}
			
			case 2 :{
				Veg_course vc = new Veg_course();
				vc.veg();
				break;
			}
			
			case 3 :{
				Non_veg_course nvc = new Non_veg_course();
				nvc.nonveg();
				break;
			}
			
			case 4 :{
				Deserts des = new Deserts();
				des.desert();
				break;
			}
			
			case 5 :{
				Drinks dri = new Drinks();
				dri.drinks();
				break;
			}
			
			default:{
				System.out.println("!Please choose number from list...\n");
				System.out.println("-----------------xxxxx-----------------");
				select_menu();
			}
			
		}
	}

	
	
	
//	for select items from menu...
	public static void select_menu_item() {

		int items;
		char select;
		
		System.out.println("\nHow many items you want to select: ");
		items = sc.nextInt();
		
		System.out.println("\nSelect items (Note: type a,b,c,d...): ");
		
		while(items>0) {
			select = sc.next().charAt(0);
			if(select == 'a' || select == 'A'){
				 System.out.println("a: "+ a); 
				 sum+=u;
				 menu_item+=a +"\t\t\tRs. "+u+"\n";
			}
			else if(select == 'b' || select=='B') {
				System.out.println("b: "+ b);
				sum+=v;
				 menu_item1+=b +"\t\t\tRs. "+v+"\n";
			}
			else if(select == 'c' || select=='C') {
				System.out.println("c: "+ c); 
				sum+=w;
				 menu_item2+=c +"\t\t\tRs. "+w+"\n";

			}
			else if(select == 'd' || select=='D') {
				System.out.println("d: "+ d); 
				sum+=x;
				 menu_item3+=d +"\t\t\tRs. "+x+"\n";

			}
			else if(select == 'e' || select=='E') {
				System.out.println("e: "+ e); 
				sum+=y;
				 menu_item4+=e +"\t\t\tRs. "+y+"\n";

			}
			else if(select == 'f' || select=='F') {
				System.out.println("f: "+ f);
				sum+=z;
				 menu_item5+= f+"\t\t\tRs. "+z+"\n";
				
			}
			else {
				System.out.println("Sorry, not availble item....");
			}

			items--;
		}
		
		
	
		System.out.println("\nItems added..\n");
		System.out.println("|-----------------xxxxxxx-----------------|");
		System.out.println("\n\tAmount is: "+sum);
		System.out.println("|-----------------xxxxxxx-----------------|");
		
		repeat();
		
		

	}
	
	
	
	
//	for repeat process (do you want anything)...
	public static void repeat() {
		System.out.println("Do you want anything else...(y / n)");
		
		char repeat = sc.next().charAt(0);
		
		if(repeat == 'y' || repeat == 'Y') {
			Main_food_class obj = new Main_food_class();
			obj.select_menu();
		}
		else {
			System.out.println("\n\n----------- Thank you... See you next time -----------");
			System.out.println("Your order is =\n"+menu_item);
			System.out.println(menu_item1);
			System.out.println(menu_item2);
			System.out.println(menu_item3);
			System.out.println(menu_item4);
			System.out.println(menu_item5);
			System.out.println("The total Amount is: "+"Rs. "+sum+"/-");
			
		}
		
		
	}
	
	
}
