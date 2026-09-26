import java.util.Scanner;
import java.util.InputMismatchException;

class StudentResultSystem{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		try{
			try{
				System.out.println("Enter subjects");
				int n=sc.nextInt();
				System.out.println("Enter marks");
				int marks[] = new int[n];
				for(int i=0; i<n;i++){
					marks[i]=sc.nextInt();
				}
				int sum=0;
				for(int i=0; i<n;i++){
					sum+=marks[i];
				}
            			int average = sum / n; 
            			System.out.println("Average Marks: " + average);

			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("cant access other than entered subjects ");
			}
			catch(ArithmeticException e){
				System.out.println("subjects cant be zero");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Enter marks in integer");
		}
	}
}