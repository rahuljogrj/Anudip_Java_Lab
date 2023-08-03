package Thursday_Lab_3rd_aug;

import java.util.Scanner;

public class Bank_details_Q4 {

	// declare all variables
	private String Password;
	private int pinno = 90044, balance = 2000;
	int ac_no, debit, credit, dep_with, check_pin, loan_per, loan_amt, loan_total_amt, time_period;
	char choice;
	String user_name, bank_name, branch_name, check_pass;
	Scanner sc = new Scanner(System.in);

	// create getter setter for private members
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPinno() {
		return pinno;
	}

	// input bank details from user
	public void details() {
		System.out.println("Bank name: ");
		bank_name = sc.next();
		System.out.println("Branch name: ");
		branch_name = sc.next();
		System.out.println("Account Number: ");
		ac_no = sc.nextInt();
		System.out.println("user name: ");
		user_name = sc.next();
		System.out.println("Account Password: ");
		Password = sc.next();
	}

	// input pin number from user
	public void passpin() {
		System.out.println("Account Pin no: ");
		check_pin = sc.nextInt();

	}

	// Print details
	public void printdetails() {
		details();
		System.out.println("\n\nBank name: " + bank_name);
		System.out.println("Branch name: " + branch_name);
		System.out.println("User name: " + user_name);
		System.out.println("Account number: " + ac_no);
		System.out.println("Account password: " + getPassword());
	}

	// verify pin number for transaction
	public void check_pass_pin() {
		if (getPinno() == check_pin) {

		}
	}

	// Check balance method
	public void check_balance() {
		System.out.println("----------------Check balance procedure---------------\n");
		passpin();
		if (pinno == check_pin) {
			System.out.println("Your current balance is : " + balance + "/-");
			System.out.println("--------------------------------------------------");
		} else {
			System.out.println("Your pin is wrong");
		}
	}

	// Deposit procedure
	public void credit_amount() {
		System.out.println("----------------Deposit procedure---------------\n");

		passpin();
		if (pinno == check_pin) {
			System.out.println("\n\nEnter the Deposit amount: ");
			credit = sc.nextInt();
			balance = balance + credit;
			System.out.println("Your balance is : " + balance + "/-");
			System.out.println("--------------------------------------------------");
		} else {

			System.out.println("Your pin is wrong");
		}

	}

	// Withdrawal procedure
	public void debit_amount() {
		System.out.println("----------------Withdrawal procedure---------------\n");

		passpin();
		if (pinno == check_pin) {
			System.out.println("\n\nEnter the withdrawal amount : ");
			credit = sc.nextInt();

			if (credit < balance) {
				balance = balance - credit;
				System.out.println("Your balance is : " + balance + "/-");
				System.out.println("--------------------------------------------------");
			} else {
				System.out.println("Your balance is : " + balance + "/-");
				System.out.println("insufficient balance.....");
				debit_amount();
			}

		} else {
			System.out.println("Your pin is wrong");
		}

	}

	// Loan Procedure
	public void loan_process() {
		System.out.println("----------------Loan procedure---------------\n");
		System.out.println("Enter loan amount: ");
		loan_amt = sc.nextInt();

		if (loan_amt >= 10000) {

			System.out.println("Time period (In years): ");
			time_period = sc.nextInt();

			loan_per = 11;

			System.out.println("Your loan amount is " + loan_amt + "\nPercentage on amount is: " + loan_per + "%");

			int interest = (loan_amt * loan_per * time_period) / 100;
			System.out.println("\nTotal amount is: " + (loan_amt + interest) + "/-\n");
			System.out.println("interest amount on " + loan_amt + " is " + interest + "/-");
		}

		else if (loan_amt <= 5000) {
			System.out.println("We provide loan for more than Rs. 10,000/-");
		}

		System.out.println("================================================================");
	}

	// Transaction method (main method)
	public void transaction() {

		do {

			System.out.println("==================================================");
			System.out.println("\nSelect: ");
			System.out.println(
					"1: Check balance.. \n2: Deposit amount.. \n3: Withdrawl amount.. \n4: Enquiry for loan..");

			System.out.println("\nEnter number for do you want: ");
			dep_with = sc.nextInt();

			switch (dep_with) {
			case 1: {
				check_balance();
				break;
			}
			case 2: {
				credit_amount();
				break;
			}
			case 3: {
				debit_amount();
				break;
			}
			case 4: {
				loan_process();
				break;
			}

			default: {
				System.out.println("Please select from (1, 2, 3): ");
				transaction();
			}

			}

			System.out.println("\ndo you want another operation(y / n): ");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		System.out.println("----------- Thank you for coming ------------");
	}

}
