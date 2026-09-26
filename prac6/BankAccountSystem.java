import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 10000.00;
        
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        
        try {
            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            
            balance -= withdrawalAmount;
            System.out.println("\n--- Transaction Successful ---");
            System.out.println("Account Holder: " + name);
            System.out.println("Withdrawn Amount: " + withdrawalAmount);
            System.out.println("Remaining Balance: " + balance);
            
        } catch (IllegalArgumentException e) {
            System.out.println("\nOutput: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}