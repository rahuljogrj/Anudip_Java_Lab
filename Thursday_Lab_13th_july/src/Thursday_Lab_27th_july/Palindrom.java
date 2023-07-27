package Thursday_Lab_27th_july;

// Extends Array_program 
public class Palindrom extends Array_program{



	public void palindrom() {
		System.out.println("Check number is palidrom or not..\n");
		System.out.println("Enter your number: ");
		
		// num1 is a user input integer value.
		input_num1();
		
		newnum = num1;
		while(num1>0) {
			
			int reminder = num1%10;
			reverse = (reverse*10) + reminder;
			num1 = num1/10;
			
		}
		
		System.out.println("Original number is: "+newnum);
		System.out.println("After reverse number is: "+reverse);
		
		if(newnum == reverse) {
			System.out.println("Your number is Palindrom.");
		}
		
		else {
			
			System.out.println("\nYour number is not Palindrom.");
		}
		newnum=0;
		reverse=0;
		
	}



}
