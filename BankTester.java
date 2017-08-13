public class BankTester {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		System.out.println(myAccount.checkBalance());
		myAccount.deposit(5);
		System.out.println(myAccount.checkBalance());
		myAccount.withdraw(1);
		System.out.println(myAccount.checkBalance());
		BankAccount yourAccount = new BankAccount(5);
		System.out.println(yourAccount.checkBalance());
		yourAccount.deposit(1);
		System.out.println(yourAccount.checkBalance());
		yourAccount.transfer(myAccount, 6);
		System.out.println(yourAccount.checkBalance());
		System.out.println(myAccount.checkBalance());
	}

}
