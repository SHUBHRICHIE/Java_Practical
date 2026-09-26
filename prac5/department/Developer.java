package department;
import company.Employee;
import java.util.Scanner;

public class Developer implements Employee{
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
			bonus=5000;
			totalSalary=baseSalary+bonus;
		
			System.out.println("Developer Total Salary is :"+ totalSalary);
		}
		public static void main(String[] args){
			Developer d1= new Developer();
			d1.acceptDetails();
			d1.displayDetails();
			d1.calculateSalary();
		}
	
}

	