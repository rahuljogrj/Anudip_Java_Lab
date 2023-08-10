package Thursday_Lab_10th_aug;

import java.util.Scanner;

public class TaxCalculator {
	
	Scanner sc = new Scanner(System.in);

	
	// handle exceptions in function from throws 
	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		
		
		// default tax amount
		double taxAmount = 0;

		System.out.println("\n--------------------- Welcome to Tax calculator ---------------------\n");
		
		
		System.out.println("Enter Name: ");
		empName = sc.nextLine();

		// if name is empty exception throw from class EmployeeNameInvalidException
		if (empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty...");
		} 
		
		
		// else execute the program 
		else {
			System.out.println("You are Indian (True or False): ");
			isIndian = sc.nextBoolean();

			
			// if isIndian is false then exception throw from class CountryNotValidException
			if (isIndian == false) {
				throw new CountryNotValidException("\nThe employee should be an Indian citizen for calculating tax...");
			}

			// else execute code
			else if (isIndian == true) {

				System.out.println("\nEnter Your Salary: ");
				empSal = sc.nextDouble();

				if (empSal >= 100000 && isIndian == true) {
					taxAmount = empSal * 8 / 100;
				}

				else if ((empSal >= 50000) && isIndian == true) {
					taxAmount = empSal * 6 / 100;
				}

				else if ((empSal >= 30000) && isIndian == true) {
					taxAmount = empSal * 5 / 100;
				}

				else if ((empSal >= 10000) && isIndian == true) {
					taxAmount = empSal * 4 / 100;
				}
				
				
				// if salary is less than 10 thousand exception throw from class TaxNotEligibleException
				else {
					throw new TaxNotEligibleException("\nThe employee does not need to pay tax...");
				}
			}
		}

		return taxAmount;

	}

}
