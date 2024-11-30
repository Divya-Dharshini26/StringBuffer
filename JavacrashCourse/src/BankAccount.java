
public class BankAccount {
	long acctNo= 1234567890l;
	String holderName="Divya";
	int acctBal= 30000;
	
	public void getbal() {
		System.out.println("Balance is "+acctBal);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.getbal();
	}

}
