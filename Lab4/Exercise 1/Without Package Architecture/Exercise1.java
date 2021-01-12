
public class Exercise1 {
	public static void main(String [] args) {
		Account acc1=new Account();
		acc1.setName("Smith");
		System.out.println("Account Holder Name = "+acc1.getName());
		acc1.setBalance(2000);
		System.out.println("Current Balance = "+acc1.getBalance());
		Account acc2= new Account();
		acc2.setName("Kathy");
		System.out.println("\nAccount Holder Name = "+acc2.getName());
		acc2.setBalance(3000);
		System.out.println("Current Balance = "+acc2.getBalance());
		acc1.deposit(2000);
		System.out.println("\nUpdated Balance = "+acc1.getBalance());
		acc2.withdraw(2000);
		System.out.println("Updated Balance = "+acc2.getBalance());
	}
}