import  java.util.Scanner;
	
class User{
	public int userId;
	public String userName;
	public long mobileNumber;
	
	public User(int userId, String userName, long mobileNumber){
		this.userId=userId;
		this.userName=userName;
		this.mobileNumber=mobileNumber;
	}
	
	public void displayUserDetails(){
		System.out.println("User Id is : "+ userId);
		System.out.println("User name is : "+ userName);
		System.out.println("Users Mobile Number is : "+ mobileNumber);
	}
	
}
class Customer extends User{
	public int orderId;
	public String customerAddress;
	
	public Customer(int userId, String userName, long mobileNumber,int orderId,String customerAddress){
		super(userId, userName, mobileNumber);
		this.orderId=orderId;
		this.customerAddress=customerAddress;
	}
}

class PremiumCustomer extends Customer{
	public String membershipType;
	public double discountPercentage;
	
	public PremiumCustomer(int userId, String userName, long mobileNumber, int orderId, String customerAddress,String membershipType, double discountPercentage){
		super(userId, userName, mobileNumber, orderId, customerAddress);
		this.membershipType=membershipType;
		this.discountPercentage=discountPercentage;
	}
	
	public double calcDiscount(double amount){
		return (amount*discountPercentage)/100;
		
	}
	
	public double finalBillAmount(double amount){
		return amount-calcDiscount(amount);
	}
	
	public void displayPremiumDetails(){
		displayUserDetails();
		System.out.println("user memebership type is : "+membershipType);
		System.out.println("user discount percentage is : "+discountPercentage);

	}
	
}
class OnlineShopSys {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter mobile number: ");
		long mobileNumber = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter order ID: ");
		int orderId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter Membership Type: ");
		String memType = sc.nextLine();
		
		System.out.println("Enter members discount percentage: ");
		double disPerc = sc.nextDouble();	
		sc.nextLine();
		
		PremiumCustomer cus1 = new PremiumCustomer(id,name,mobileNumber,orderId,address,memType,disPerc);
		
		cus1.displayPremiumDetails();
		
		System.out.println("Enter order amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("dicount applied is "+cus1.calcDiscount(amount));
		System.out.println("your final bill amount after dicount is "+cus1.finalBillAmount(amount));
	
		sc.close();
	}
}