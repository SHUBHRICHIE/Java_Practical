import java.util.Scanner;

class Fibonnaci{
	public static void main(String[] cp){

	int firstNum=0;
	int secondNum=1;
	int outp=0;

	Scanner scanner =new Scanner(System.in);

	System.out.print("how many fibo numbers wanted: ");
	int num=scanner.nextInt();

	scanner.close();

	System.out.println(firstNum);
	System.out.println(secondNum);

	while(num!=0){
		outp=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=outp;

		System.out.println(outp);

		num--;
	}
	}
}