import java.util.Scanner;
import java.util.InputMismatchException;

class StudentMarksSystem{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter subjects");
			int n=sc.nextInt();
			System.out.println("Enter marks");
			int marks[] = new int[n];
			for(int i=0; i<n;i++){
				marks[i]=sc.nextInt();
			}
			//	System.out.println("Accessing extra curriculum slot at index 5: " + marks[5]);

           	 	int sum=0;
			for(int i=0; i<n;i++){
				sum+=marks[i];
			}
            		int average = sum / n; 
            		System.out.println("Average Marks: " + average);
		}
		catch(InputMismatchException e){
			System.out.println("Enter marks in integer");
		}
		catch(ArithmeticException e){
			System.out.println("Subjects can't be zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("subjects are only 3");
		}
		catch(NumberFormatException e){
			System.out.println("marks cant b e");
		}
	}
}