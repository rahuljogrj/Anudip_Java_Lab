package Thursday_Lab_27th_july;

import java.util.Scanner;

public class Multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twodimenisional();
	}
	
	
	public static void twodimenisional() {
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		

		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.print(j+"\t");
			}
			System.out.println(i);
		}
		
	}

}
