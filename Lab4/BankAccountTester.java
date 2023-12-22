package Lab04;

import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args)
	{
		
		// user input

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name, last name, and account number of customer");
		
		System.out.print("First, enter the first name of the customer: ");
		String firstname = sc.nextLine();
		
		System.out.print("Enter the last name of the customer: ");
		String lastname = sc.nextLine();
		
		System.out.print("Finally, enter the customer's account number: ");
		int accNo = Integer.valueOf(sc.nextLine());

		
		// Create your BankAccount object
		BankAccount b1 = new BankAccount(4500);
		
		// Change your BankAccount object's data using the user input
		b1.setName(firstname,lastname);
		b1.setAccountNumber(accNo);
		
		// TODO Implement tests below using b1 and EXPERIMENT! 
		// Maybe try playing around with a new b2 object?
		// When turning in this assignment, call all the following:
		// 1) getter for full name and getter for account number
		// 2) deposit, withdraw, get balance
		// 3) set loan, get interest
		// 4) check account number if Armstrong number
		
	}

}
