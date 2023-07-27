package Thursday_Lab_27th_july;


// extends Var_Scan 
public class Swapping_no extends Var_Scan{
	

	// swapping two number without third variable
	public void swapping_two_no_without() {   

		System.out.println("\n------- Swapping numbers without third variable --------\n");
		System.out.println("Enter 2 number: ");
		
		// num1, num2 are an user inputs integer value.
		input_swapping();
		
		System.out.println("the values before swapping: "+ num1 +"\t\t"+ num2);
		
		num1 = num1+num2;
		num2 = num1-num2;                 
		num1 = num1-num2;			
		
		System.out.println("\nthe values after swapping: "+ num1 +"\t\t"+ num2);
		
	}
	
	

	
	// swapping two number with third variable
	public void swapping_two_no_with() {   
		System.out.println("\n------- Swapping numbers with third variable -------\n");
		System.out.println("Enter 2 number: ");
		
		// num1, num2 are an user inputs integer value.
		input_swapping();
		
		System.out.println("the values before swapping: "+ num1 +"\t\t"+ num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\nthe values after swapping: "+ num1 +"\t\t"+ num2);
	
	}
	
	
		
		
	

}
