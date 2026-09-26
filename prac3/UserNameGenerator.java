import java.util.Scanner;

class UserNameGenerator{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fName = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lName = sc.nextLine();
		
		StringBuffer username = new StringBuffer();	
		
		username.append(fName.toLowerCase()).append(".").append(lName.toLowerCase());
		
		System.out.println("Your username is: "+ username);
	
		sc.close();	
	}	
	
}