class BankAccount{
	private int balance=1000;

	public synchronized void deposit(int amount){
		this.balance+=amount;
		System.out.println("Deposited: "+amount+" Current balance is: "+this.balance);
	}

	public synchronized void withdraw(int amount){
		if(balance>=amount){
			this.balance-=amount;
			System.out.println("Withdraw: "+amount+" Current balance is: "+this.balance);
		}else{
			System.out.println("Insufficent balance");
		}
	}
}

class DepositThread extends Thread{
	private BankAccount account;

	public DepositThread(BankAccount account){
		this.account=account;
	}

	public void run(){
		account.deposit(500);
	}
}

class WithdrawThread extends Thread{
	private BankAccount account;

	public WithdrawThread(BankAccount account){
		this.account=account;
	}

	public void run(){
		account.withdraw(700);
	}
}

class Main3{
	public static void main(String[] args){
		BankAccount sharedAccount=new BankAccount();

		DepositThread t1=new DepositThread(sharedAccount);
		WithdrawThread t2=new WithdrawThread(sharedAccount);
		
		t1.start();
		t2.start();
	}
}

