package studentinfo;
import java.util.Scanner;

public class Student{
	public int studentId;
	public String studentName;
	public String course;
	public double marks;
 
	
	public void acceptDetails(){
		Scanner sc = new Scanner(System.in);		
	
		System.out.println("Enter student Id: ");
		studentId = sc.nextInt();
		sc.nextLine();
	
		System.out.println("Enter student name: ");
		studentName = sc.nextLine();
	
		System.out.println("Enter course: ");
		course = sc.nextLine();
	
		System.out.println("Enter marks : ");
		marks = sc.nextDouble();
	}
	
	public void displayDetails(){
		System.out.println("StudentId is:  "+ studentId);
		System.out.println("Student name is:  "+studentName);
		System.out.println("course is:  "+ course);
		System.out.println("marks is:  "+ marks);		
	}
	
	public void calculateGrade(){
		if(marks>=90 && marks<=100){
			System.out.println("O");
		}else if(marks>79){
			System.out.println("A");
		}else if(marks>69){
			System.out.println("B");
		}else if(marks>59){
			System.out.println("C");
		}else if(marks<60){
			System.out.println("D");
		}else if(marks<0){
			System.out.println("Marks cant be negative!!");
		}
		
}








}