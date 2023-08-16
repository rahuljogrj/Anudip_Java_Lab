package multiThreading;

public class Prime_numbers extends Thread{
	public void run() {
		System.out.println("prime numbers from 1000 to 1");
		
		int i;
	       int num =0;
	       
	       String  primeNumbers = "";

	       for (i = 1000; i >= 1; i--)         
	       { 

	          int counter=0; 	  
	          for(num = i; num>=1; num--)
	          {
	             if(i%num==0)
				     {
			 			counter = counter + 1;
				     }
	          }
			  if (counter ==2)
			  {
			     primeNumbers = primeNumbers + i+"\n";
			  }	
			  
	       }
	       System.out.println(primeNumbers);
	       
	       
	       
	}
}
