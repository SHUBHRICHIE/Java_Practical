import java.util.Scanner;
import java.util.InputMismatchException;


class ExceptionHandle{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		try{
			int a=1;
			int b=0;
			int c=a/b;
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");		
		}
		
		try{
			int arr[] = new int[4];
			arr[5]=6;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid array index");		
		}
		
		try{
			String mark="abc";
			int marks=Integer.parseInt(mark );
		}catch(NumberFormatException e){
			System.out.println("Marks must be numeric");		
		}
		
		
		try{
			System.out.println("Enter an integer:");
			int marks=sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Please enter an integer");		
		}
		
		try{
			String studentName = null;
			System.out.println(studentName.length());
			}
			catch(NullPointerException e){
			System.out.println("Student name is null");		
		}
		
		try{
			String studentName = "Shubham";
			System.out.println(studentName.charAt(-1));
			}
			catch(StringIndexOutOfBoundsException e){
			System.out.println("Invalid charcter index");		
		}
	
	}

}