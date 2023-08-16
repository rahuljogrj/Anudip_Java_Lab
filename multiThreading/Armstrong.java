package multiThreading;

import java.util.Scanner;

public class Armstrong extends Thread {
	Scanner sc = new Scanner(System.in);

	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			System.out.println("Armstrong Numbers from 1 to 1000.......");
			int num, newnum, sum = 0;
			System.out.println("Enter your three digit number: ");
			num = sc.nextInt();

			newnum = num;

			do {
				int reminder = num % 10;
				sum = sum + (reminder * reminder * reminder);
				num = num / 10;
			} while (num > 0);

			System.out.println(sum);

			if (newnum == sum) {
				System.out.println("This is Armstrong number..");
			} else {
				System.out.println("This is not Armstrong number");
			}
		}
	}
}
