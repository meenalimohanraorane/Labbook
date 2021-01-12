
public class Current extends Account {
	final double overDraftLimit = 5000;
	
	@Override
	double withdraw(double amt)
	{
		boolean flag=true;
		if(amt>overDraftLimit) {
			flag=false;
			System.out.println(flag);
		}
		return amt;
	}
}