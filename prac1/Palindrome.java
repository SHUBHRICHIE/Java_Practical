import java.util.Scanner;

class Palindrome{
	public static void main(String[] cp){

	Scanner scanner =new Scanner(System.in);

	System.out.print("Enter String: ");
	String original=scanner.nextLine();
	
	char[] chara= original.toCharArray();

	int left=0;
	int right= chara.length - 1;

	scanner.close();

	

	while(left<right){
		char temp=chara[left];
		chara[left]=chara[right];
		chara[right]=temp;
		
		left++;
		right--;
	}

	String reversed= new String(chara);
	if(reversed.equals(original)){
		System.out.println("Its Palindrome");}
	else{
		System.out.println("Its not Palindrome");}
}
}	