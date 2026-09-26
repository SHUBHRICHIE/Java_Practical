abstract class Payment{
	public double amount;	
	
	Payment(double amount){
		this.amount=amount;
	}
	
	public void displayReceipt(){
		System.out.println("Total receipt amount is "+this.amount);
	}
	
	public abstract void processPayment();
}

class CryptoPayment extends Payment{
	public String walletAddress;
	
	CryptoPayment(double amount, String walletAddress){
		super(amount);
		this.walletAddress=walletAddress;
	}
	
	 public void processPayment(){
		System.out.println("the amount of "+amount+" is been securely transferred to "+walletAddress+" wallet");
	}
	
	public static void main(String[] args){
		CryptoPayment pay1 = new CryptoPayment(5000, "AS7&SdaEWs552");
		
		pay1.displayReceipt();
		pay1.processPayment();
		
	}
	
}