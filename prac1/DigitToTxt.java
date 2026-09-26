import java.util.Scanner;

class DigitToTxt{
	public static void main(String cp[]){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int originalNum = scanner.nextInt();
		int num=originalNum;
	
		String words= "";
		
		if(num==0){
		System.out.println("Zero");	
		}
		
		while(num>0){
			int rem=num%10;
		
			String word = switch (rem) {
				case 1 -> "one";
				case 2 -> "two";
				case 3 -> "three";
				case 4 -> "four";
				case 5 -> "five";
				case 6 -> "six";
				case 7 -> "seven";
				case 8 -> "eight";
				case 9 -> "nine";
				case 0 -> "zero";
				default -> "";
			};

			words=word+" "+words;
			num/=10;
		}
		System.out.println(originalNum+" in words is :"+words);
	}
}