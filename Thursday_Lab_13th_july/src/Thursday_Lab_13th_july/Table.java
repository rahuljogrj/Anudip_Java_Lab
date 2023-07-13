package Thursday_Lab_13th_july;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		
//		initializing variable
		int i, tableno, ans;
		Scanner sc = new Scanner(System.in);
		
//		message for user
		System.out.println("enter the number you want to table : ");
		tableno = sc.nextInt();
		
		
//		print table from for loop
		for(i=1; i<=10; i++) {
			ans = tableno*i;
			System.out.println(tableno+"*"+i +" = "+ ans);
		}
		
		
	}

}
