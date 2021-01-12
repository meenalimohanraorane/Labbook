
public class Savings extends Account {
	final double minimumBalance = 500;
	
	@Override
	double withdraw(double amt) {
		if(balance<minimumBalance) {
			return balance;
		}
		else {
			return (balance-amt);
		}
	}
}
