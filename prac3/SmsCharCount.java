import java.util.Scanner;

class SmsCharCount{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		int maxSize=160;
			
		System.out.print("Enter sms message: ");
		String msg = sc.nextLine();

		StringBuilder sms = new StringBuilder(msg);
		
		int charUsed = sms.length();
		int charsLeft = maxSize-charUsed;
	
		System.out.println("Chars Used: "+charUsed+" Chars Left: "+charsLeft);
	
		if(charsLeft< 0){
			System.out.println("Your message exceeds the limit by "+ Math.abs(charsLeft)+ " Characters:");
		}
		sc.close();
	}
}