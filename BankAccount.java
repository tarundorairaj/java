
public class BankAccount {
	private double balance;
	private String name;
	private int number;
	public BankAccount(String ownerName, int accountNumber)
	{
		name = ownerName;
		number = accountNumber;
		balance = 0;
	}
	
	public BankAccount(String ownerName, int accountNumber, double initialBalance)
	{
		balance = initialBalance;
		name = ownerName;
		number = accountNumber;
	}
	
	public BankAccount()
	{
		name = "Epicawesomemartiansuperhero";
		number = 999999;
		balance = 0;
	}
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
		name = "Epicawesomemartiansuperhero";
		number = 999999;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double checkBalance()
	{
		return balance;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setNumber(int accountNumber)
	{
		number = accountNumber;
	}
	
	public void setName(String accountName)
	{
		name = accountName;
	}
	public double total(BankAccount otherAccount)
	{
		return balance + otherAccount.checkBalance();
	}
	public void transfer(double amount, BankAccount otherAccount)
	{
		this.withdraw(amount);
		otherAccount.deposit(amount);
	}
	}
