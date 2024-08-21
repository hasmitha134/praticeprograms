package studyopedia;

public class BankAccount {
	private String Accountnumber;
	private String Acountholdername;
	private double balance;
	public BankAccount(String Accountnumber,String Acccountholdername,double initialbalance)
	{
		this.Accountnumber = Accountnumber;
		this. Acountholdername = Acccountholdername;
		this.balance = initialbalance;
		
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("deposited:$"+amount);
		}
		else
		{
			System.out.println("depost amount must be positive");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance)
			{
				
			}
		}
	}
	
	
	public static void main()
	{
		
	}

}
