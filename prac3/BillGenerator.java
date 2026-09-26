import java.util.Scanner;

class BillGenerator{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many items: ");
		int itemsCount = sc.nextInt(); 
		
		sc.nextLine();
		
		StringBuilder bill = new StringBuilder();
		bill.append("********Shop Bill********\n");
		
		int total=0;

		for(int i = 1; i<=itemsCount;i++){
		System.out.println("Enter "+i+" items name");
		String itemName = sc.nextLine();
		
		System.out.println("Enter "+i+" items price");
		int itemPrice = sc.nextInt();

		sc.nextLine();
		
 		total+=itemPrice;

		bill.append(String.format("%-10s : %d\n",itemName ,itemPrice ));
			
		}
		bill.append("-----------------\n");
		bill.append(String.format("%-10s : %d\n","Total",total));
		
		System.out.println("\n"+bill.toString());
		
		sc.close();
		
	}
}