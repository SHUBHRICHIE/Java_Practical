package department;
import company.Employee;
import java.util.Scanner;

public class Manager implements Employee{
		int empId;
		String empName;
		double baseSalary;
		double bonus;
		double totalSalary;

		public void acceptDetails(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id: ");
			empId = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter employee name: ");
			empName= sc.nextLine();
			
			System.out.println("Enter employee base salary: ");
			baseSalary= sc.nextDouble();
			
		}
		
		public void displayDetails(){
			System.out.println(" id is: "+empId);
			System.out.println(" name is : "+empName);
			System.out.println(" base salaryis : "+baseSalary);
			System.out.println(" bonus is: "+bonus);
		}
		public void calculateSalary(){
			bonus=7000;
			totalSalary=baseSalary+bonus;
		
			System.out.println("Manager Total Salary is :"+ totalSalary);
		}
		public static void main(String[] args){
			Manager m1= new Manager();
			m1.acceptDetails();
			m1.displayDetails();
			m1.calculateSalary();
		}
	
}

	