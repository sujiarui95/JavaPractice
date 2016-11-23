package banking;

public class Account {
	private double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	public double getBalance() {
		return balance;
	}
	//存钱
	public void deposit(double amt) {
		balance += amt;
		System.out.println("deposit: " + amt);
	}
	//取钱
	public void withdraw(double amt) {
		if(balance >= amt){
			balance -= amt;
			System.out.println("withdraw "+ amt);
		}
		else System.out.println("余额不足");
	}
}
