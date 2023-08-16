package multiThreading;

public class Priority extends Thread{

	public static void main(String[] args) {

		Armstrong obj1 = new Armstrong();
		Prime_numbers obj2 = new Prime_numbers();

		
		obj1.start();
		obj2.start();

		
	}

}
