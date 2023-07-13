//Q2)WAP using switch case which will display the option of all operators


package Thursday_Lab_13th_july;

import java.util.Scanner;

public class Switch_tasks {

	public static void main(String[] args) {
		
		
//		initializing variables
		int choice, num1, num2;
		char repeat;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: Arithmetic operators \n2: Assingment operators \n3: Bitwise operator \n4: Logical  operator \n5: Relational Operator \n6: Ternary operator");
		
		
		
//		do while for repetition 
		do {

//			ask user to which operation run
			System.out.println("\nEnter the number which operator you want to perform");
			choice = sc.nextInt();
		
	
			switch(choice) 
			{
			
	//		for arithmetic operator
				case 1:{
					System.out.println("Your choice is Arithmetic operators");
					System.out.println("\nEnter the any two number");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					int add = num1 + num2;
					int sub = num1 - num2;
					int div = num1 / num2;
					int mul = num1 * num2;
					int mod = num1 % num2;
					System.out.println("Addition is: "+ add);
					System.out.println("Subtraction is: "+ sub);
					System.out.println("Division is: "+ div);
					System.out.println("Multiplication is: "+ mul);
					System.out.println("Modulus is: "+ mod);
					break;
					}
				
				
	//			Assignment operator
				case 2:{
					System.out.println("Your choice is Assingment operators");
					System.out.println("\nEnter the single number");
					num1 = sc.nextInt();
					
					
					System.out.println("num1+=10 : "+(num1+=10));
					System.out.println("num1-=10 : "+(num1-=10));
					System.out.println("num1*=10 : "+(num1*=10));
					System.out.println("num1/=10 : " +(num1/=10));
					System.out.println("num1%=10 : " + (num1%=10));
					System.out.println("num1=10 : "+(num1=10));
					
					break;
					}
				
				
	//			for bitwise operator
				case 3:{
					System.out.println("Your choice is Bitwise operators");
					System.out.println("\nEnter the any two number");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("(num1>num2)&(num1<num2)"+((num1>num2)&(num1<num2)));
					System.out.println("(num1>num2)&(num1<num2)"+((num1>num2)^(num1<num2)));
					System.out.println("(num1>num2)&(num1<num2)"+((num1>num2)|(num1<num2)));
					break;
					}
				
	//			for Logical operator
				case 4:{
					System.out.println("Your choice is Logical operators");
					System.out.println("\nEnter the any two number");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("(num1 > num2) && (num1 < num2)" +((num1 > num2) && (num1 < num2)) );
					System.out.println("(num1 > num2) || (num1 < num2)" +((num1 > num2) || (num1 < num2)) );
					System.out.println("!(num1 > num2)"+(!(num1 > num2)) );
					
					break;
					}
				
	//			for relational operator
				case 5:{
					System.out.println("Your choice is Relational operators");
					System.out.println("\nEnter the any two number");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("for check num1 is greater than num2: "+ (num1 > num2));
					System.out.println("for check num1 is lesser than num2: "+ (num1 < num2));
					System.out.println("for check num1 is equal to num2: "+ (num1 == num2));
					System.out.println("for check num1 is less than equal to num2: "+ (num1 <= num2));
					System.out.println("for check num1 is greater than equal to num2: "+ (num1 >= num2));
					System.out.println("for check num1 is not equal to num2: "+ (num1 != num2));
					
					break;
					}
				
				
	//	for ternary operator
				case 6:{
					System.out.println("Your choice is Ternary operators");
					System.out.println("\nEnter the any two number");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					
					String res=(num1 < num2) ? "Num 2 is greater than Num 1 ": "Num 2 is lesser than Num 1";	
					System.out.println(res);
					
					break;
					}
				
				default:{
					System.out.println("invalid inpuit");
				}
			}
				

			
//			ask user for repetition
				System.out.println("\n\nDo you want to perform another operation...(y / n):");
			 repeat = sc.next().charAt(0);
				
				
				
		}while(repeat == 'Y' || repeat == 'y');
		
		
//		final message
		System.out.println("\n\nThank you... END");
		
	
		
	}

}
