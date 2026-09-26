import java.util.Scanner;

class BankAccountArray{
	long accNumber;
	String accHolder;
	double balance;

	public BankAccountArray(){
		this.accNumber=0;
		this.accHolder="Unknown";
		this.balance=0.0;
	}

	public BankAccountArray(long accNumber,String accHolder, double openBalance){
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
		
		BankAccountArray[] users = new BankAccountArray[5];
		
		System.out.println("Enter details for 5 customers:");
		
		for (int i = 0; i < users.length; i++) {
            		System.out.println("Customer " + (i + 1) + ":");
            		System.out.print("Enter Account Number: ");
            		long accNumber = sc.nextLong();
            		sc.nextLine();

            		System.out.print("Enter Account Holder Name: ");
            		String accHolder = sc.nextLine();

            		System.out.print("Enter Opening Balance: ");
            		double balance = sc.nextDouble();

            		users[i] = new BankAccountArray(accNumber, accHolder, balance);
            		System.out.println();
        	}
		
		
        	for (int i = 0; i < users.length; i++) {
            		users[i].displayAccountDetails();
       		}
       		 				
		sc.close();
		
	}
}
