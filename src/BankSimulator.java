package Bank_Account;

public class BankSimulator
{
	Account [] accs;
	public BankSimulator()
	{
		accs 	= new Account[10];
		
		accs[0] = new Account();
		accs[0].acc_no = 1;
		accs[0].acc_name = "สมใจ";
		accs[0].acc_password = "1234";
		accs[0].balance = 1000000;
		
		
		accs[1] = new Account();
		accs[1].acc_no = 2;
		accs[1].acc_name = "JK Rolling";
		accs[1].acc_password = "1234";
		accs[1].balance = 1000000;
		
		
		accs[2] = new Account();
		accs[2].acc_no = 3;
		accs[2].acc_name = "David Ronan";
		accs[2].acc_password = "1234";
		accs[2].balance = 1000000;
		
	}
	
	private void printBalance(Account a)
	{
		if(a == null)
		{
			return;
		}
		System.out.println(a.acc_name + " have " + a.balance + " BAHT ");
	}
	
	private Account getAccountByAccNo(int acc_no)
	{
		for (int i=0; i< accs.length; i++)
		{
			if(accs == null) continue;
			if (accs[i].acc_no == acc_no)
			{
				return accs[i];
			}
		}
		return null;
		
	}

	
	public void deposit(int acc_no, double amount)
	{
		Account a = getAccountByAccNo(acc_no);
		if (a == null)
		{
			System.out.println(" !!! ACCOUNT NOT FOUND !!! --> NO ACCOUNT NO. ");
			return;
		}
		a.balance += amount;
		printBalance(a);
		
	}
	
	
	public void withdraw(int acc_no, String password, double amount)
	{
		Account a = getAccountByAccNo(acc_no);
		if (a == null)
		{
			System.out.println(" !!! ACCOUNT NOT FOUND !!! --> NO ACCOUNT NO. ");
			return;
		}
		
		if(a.acc_password.equals(password))
		{
			//do not anything when it's true.
		}
		else
		{
			System.out.println("WRONG PASSWORD!!"); 
			return;
		}
		
		if (a.balance - amount < 0) // Balance not enough to withdraw.
		{
			System.out.println("NOT ENOUGH MONEY");
			return;
		}
		a.balance -= amount; // You can withdraw money.
		printBalance(a);
			
	}
	
	public void getBalance(int acc_no, String password)
	{
		Account a = getAccountByAccNo(acc_no);
		if (a == null)
		{
			System.out.println(" !!! ACCOUNT NOT FOUND !!! --> NO ACCOUNT NO. ");
			return;
		}
		if(a.acc_password.equals(password))
		{
			//do not anything when it's true.
		}
		else
		{
			System.out.println("WRONG PASSWORD!!"); 
			return;
		}
		printBalance(a);
		
	}	
	
}
