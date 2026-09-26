import java.util.Scanner;
class BankAccount{
	long accNumber;
	String accHolder;
	double balance;

	public BankAccount(){
		this.accNumber=0;
		this.accHolder="Unknown";
		this.balance=0.0;
	}

	public BankAccount(long accNumber,String accHolder, double openBalance){
		this.accNumber=accNumber;
		this.accHolder=accHolder;
		this.balance=openBalance;
	}

	public void deposit(double depositAmount){
		this.balance+=depositAmount;
		System.out.println(depositAmount+" has been deposited .");
	}

	public void withdraw(double withdraw){
		double check= this.balance-withdraw;
		if(check<0){
		System.out.println("You don't have sufficient balance!!");
		}else{
			this.balance-=withdraw;
			System.out.println(withdraw+" has been withdrawan .");
		}
	}
	
	public void displayBalance(){
		System.out.println("your current balance is : "+balance);
	}
	
	public void displayAccountDetails(){
		System.out.println("Account number is : "+accNumber);
		System.out.println("Account holder name is : "+accHolder);
		System.out.println("Your current Balance is : "+balance);
	}

	public static void main(String []cp){
		Scanner sc = new Scanner(System.in);
		
		BankAccount user1 = new BankAccount();
		user1.displayAccountDetails();
		
		BankAccount user2 = new BankAccount(407212500, "Furqan", 5000);
		user2.displayAccountDetails();
		
		user2.deposit(5000);
		user2.displayBalance();
		user2.withdraw(2500);
		user2.displayAccountDetails();
		
		user1.deposit(200);
		user1.displayBalance();
		user1.withdraw(300);
		user1.displayAccountDetails();
		
		sc.close();
		
	}
}

