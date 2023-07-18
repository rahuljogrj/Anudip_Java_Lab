package java_Anudip_first;

public class Function_task {

	public static void main(String[] args) {
		
		
//	all function declare in main function
		fact();
		prime();
//		reverse_no();
		System.out.print("the reverse number is: "+reverse_no());
		
	}
	
	
//	function for factorial
	public static void fact() {
		int num=5, f=1;
		while(num>0) {
			f = num*f;
			num--;
		}
		System.out.println("the factorial is: "+f);
	}
	
	
//	function for prime number
	public static void prime ()
	   {		
	       int i =0;
	       int num =0;
	       
	       String  primeNumbers = "";

	       for (i = 1; i <= 20; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
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
	       System.out.println("Prime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);
	   }
	
	
//	function for reverse_no
		public static int reverse_no() {
			
//			using while loop
			
			int num=1234, reverse=0;
			while(num!=0){
				int reminder= num%10;
				reverse = reverse*10 + reminder;
				num = num/10;	
			}
			
			return reverse;
						
			
			
			
//			using for loop
//			int number=34567, reverse=0;
//			for(;number!=0;number=number/10) {
//				int reminder = number%10;
//				reverse = reverse*10+reminder;
//				
//			}
//			System.out.println("the reverse number is: "+reverse);
			
		
	}

}
