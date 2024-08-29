package Bank_Account;

import java.util.Scanner;

public class TestBankSimulator
{
	
	public static int printMenu(Scanner sc)
	{
		System.out.println("=====MENU=====");
		System.out.println("PLEASE SELECT YOUR OPTION");
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAWW");
		System.out.println("3. CHECK BALANCE");
		System.out.println("4. EXIT");
		
		
		int i = sc.nextInt();sc.nextLine();
		while(i <= 0 || i > 4)
		{
			System.out.println("=====MENU=====");
			System.out.println("PLEASE SELECT YOUR OPTION");
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAWW");
			System.out.println("3. CHECK BALANCE");
			System.out.println("4. EXIT");
			i = sc.nextInt(); sc.nextLine();
		}
		
		
		return i;
	}
	
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		BankSimulator sim = new BankSimulator();
		while(true)
		{
		int input = printMenu(sc);
		if (input == 1)
		{
			System.out.println("Please input acc_no :");
			int acc_no = sc.nextInt(); sc.nextLine();
			System.out.println("Please input amount to deposit :");
			double amount = sc.nextDouble(); sc.nextLine();
			sim.deposit(acc_no, amount);
		}
		
		else if(input == 2)
		{
			System.out.println("Please input acc_no :");
			int acc_no = sc.nextInt(); sc.nextLine();
			System.out.println("Please input password :");
			String password = sc.nextLine(); sc.nextLine();
			System.out.println("Please input amount to withdraw :");
			double amount = sc.nextDouble(); sc.nextLine();
			sim.withdraw(acc_no,password,amount);
		}
		
		else if(input == 3)
		{
			System.out.println("Please input acc_no :");
			int acc_no = sc.nextInt(); sc.nextLine();
			System.out.println("Please input password :");
			String password = sc.nextLine();
			
			sim.getBalance(acc_no,password);
		}
		
		else if(input == 4)
		{
			return;
		}
	}
		
}

}
