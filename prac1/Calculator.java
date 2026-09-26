import java.util.Scanner;


class Calculator{
	public static void main(String[] cp){
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first number: ");

	double num1= scanner.nextDouble();
	System.out.print("Enter operation: ");

	char op= scanner.next().charAt(0);
	System.out.print("Enter second number: ");

	double num2= scanner.nextDouble();
	
	scanner.close();

	switch (op){
		case '+' -> System.out.println(num1+num2);
		case '-' -> System.out.println(num1-num2);
		case '*' -> System.out.println(num1*num2);
		case '/' -> System.out.println(num1/num2);
		case '%' -> System.out.println(num1%num2);
		default -> System.out.println("Enter Valid Operator");
		}

	}
}