package Thursday_Lab_27th_july;

// extends Var_Scan class 
public class Array_program extends Var_Scan {
	
	
	
//find greater number from array
	public void grt() {
		System.out.println("\n----- find Greatest number from Array -----");
		
		int[] arr=accept();
		int grt = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(grt<arr[i]) {
				grt=arr[i];
			}
		}
		
		System.out.println("\nthe greatest number in array is: "+grt);
		
	}
	
	
	
//	find smallest value from array
	public void smt() {
		System.out.println("\n----- find Smallest number from Array -----");
		int[] arr=accept();
		smt = arr[0];
		for(i=0; i<arr.length; i++) {
			if(smt>arr[i]) {
				smt = arr[i];
			}
		}
		
		System.out.println("\nThe smallest number from array is: "+smt);
			
	}
	
	
	
//	print ascending order or array
	public void ascen() {
		System.out.println("\n\n----- Sort array by Ascending order-----");
		int[] arr = accept();
		temp = 0;
		for(i=0; i<size; i++) {
			for(j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) 
				{
					// condition to find descending order
					Array_ascen_descen();
				}
			}
		}
		
		System.out.println("\nthe ascending order is: ");
		
//		print array one by one
		Print_array();
	}
	
	
	
	
//	print descending order or array
	public void descen() {
		System.out.println("\n\n----- Sort array by Descending order -----\n");
		int[] arr = accept();
		temp = 0;
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					
					// condition to find descending order
					Array_ascen_descen();
				}
			}
		}
		System.out.println("\nthe descending order is: ");
		
//		print array one by one
		Print_array();
	}
	


}
