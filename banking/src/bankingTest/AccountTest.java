package bankingTest;
import banking.*;

public class AccountTest {
	public static void main(String[] args) {
		Account account;
		//Create an account with a 500 balance
		account = new Account(500);
		System.out.println("Create a new account with a 500 balance");
		
		account.deposit(118.2);
		System.out.println(account.getBalance());
		
	}
}
