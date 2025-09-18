package tutorial2;

class Account {	
	private double balance;
	
	public Account(double balance) {
		this.balance= balance;
	}
	
	public double getbalance(){
		return balance;
	}
}

public class BankSystemOOPS {
	public static void main(String[] args) {
		Account[] accounts = {
				new Account(50000.0),
				new Account(300000.0),
				new Account(900000.0),
		};
		
		double totalbalance = 0;
		
		for(Account acc:accounts) {
			totalbalance=totalbalance+acc.getbalance();
		}
		System.out.println("Total balance in bank "+totalbalance);

	}

}
