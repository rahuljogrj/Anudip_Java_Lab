
// In this Thursday Lab we connect Multilevel inheritance and Single inheritance.
// Multilevel inheritance:-   Var_scan (gp) ---> Array_program (p) ---> Palindrome (c)
// Single inheritance:-   Var_scan (p)---> Swapping_no (c)





package Thursday_Lab_27th_july;
public class Operation_class {
	
	public static void main(String[] args) {
		operation_seq();
	}	
	
	
	
	public static void operation_seq() {
		
		System.out.println("1: Array Methods (Greater number, Smaller number, Ascending, Descending order) \n2: Find Palindrome \n3: Swapping two numbers");
		
		
		// create object for Palindrom because from Palindrom we can use Array_program class and Var_Scan class all function. 
		Palindrom obj=new Palindrom();
					
		
		do {
			
			System.out.println("\nChoice number from list: \n");
			// ask to user which operation do you want perform
			obj.num = obj.input_num1();
			 
			
			
			switch(obj.num) {

				case 1:{
					// methods from Array_program			
					
					System.out.println("------xxxx------ Array methods perform one by one... Please read instruction ------xxxx------ ");
					obj.grt();
					obj.smt();
					obj.ascen();
					obj.descen();
					System.out.println("---------xxxxx--------- Array methods End ---------xxxxx---------\n\n");
					break;
				}
				
				case 2:{
					// method from palindrome.
					System.out.println("------xxxx------ Palindrome method Please read instruction ------xxxx------\n");
					obj.palindrom();
					System.out.println("\n---------xxxxx--------- Palindrome methods End ---------xxxxx---------\n\n");
					break;
				}
				
				case 3:{
		
					Swapping_no obj1 = new Swapping_no();
					System.out.println("------xxxx------ Swapping_no method Please read instruction ------xxxx------ ");
					obj1.swapping_two_no_without();
					obj1.swapping_two_no_with();
					System.out.println("---------xxxxx--------- Swapping_no methods End ---------xxxxx---------");
					break;
				}
				
				default:{
					System.out.println("-------------------------xxxxxxxxxxxxxxxxxxxxxx---------------------------");
					System.out.println("Please enter number from (1, 2, 3): ");
					operation_seq();
				}
				
			}
			

			// condition for repeat process.
			System.out.println("\n\nDo you want perform another operation...(y / n): ");
			obj.char1 = obj.input_char_1();
			
		}while(obj.char1 == 'y' || obj.char1=='Y');
			
		
		
		System.out.println("\n\n ------------xxxxxxxx------------- Thank you... Process Completed ------------xxxxxxxx-------------");
	}
	
}
