
public class Account extends Person {
	long accNum;
	double balance;
	Person accHolder;
	
	
	
	long getAccNum() {
		return accNum;
	}
	void setAccNum(long accNum) {
		this.accNum=(long) Math.random();
	}
	
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance=balance;
		if(balance<500)
			System.out.println("Minimum balance required is 500");
	}
	
	void deposit(double amt) {
		balance=balance+amt;
	}
	double withdraw(double amt) {
		balance=balance-amt;
		return balance;
	}
}

