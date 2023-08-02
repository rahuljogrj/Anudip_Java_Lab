package Polymorphism;


// method override from Poly_overriding (parent)
public class Poly_overriding_1 extends Poly_overriding{

	public static void main(String[] args) {
		
		//method call from same class
		Poly_overriding obj = new Poly_overriding_1();
		obj.swap_no_twoV();
		obj.swap_no_threeV();
		
		
		//method call from parent class
		Poly_overriding obj1 = new Poly_overriding();
		obj1.swap_no_twoV();
		obj1.swap_no_threeV();
	}
	
	
	
	
	// swap number without third variable
	@Override
	public void swap_no_twoV() {
		System.out.println("====================================================================");
		System.out.println("\n---------- Swap numbers from Poly_overriding_1 (from obj) ----------\n");
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("The value before swapping num1 and num2: "+num1+"\t"+num2);
		
		num1 = num1+num2;			// 10+20=30=num1
		num2 = num1-num2;			// 30-20=10=num2
		num1 = num1-num2;			// 30-10=20=num1
		
		System.out.println("The value after swapping num1 and num2: "+num1+"\t"+num2);
	}
	
	
	
	// swap number with third variable
	@Override
	public void swap_no_threeV() {
		System.out.println("====================================================================");
		System.out.println("\n---------- Swap numbers with third variable from Poly_overriding_1 (from obj) ----------\n");
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("The value before swapping num1 and num2: "+num1+"\t"+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The value after swapping num1 and num2: "+num1+"\t"+num2);
	}

	


}
