import java.util.Scanner;
class Student{
	
	int id;
	String name;
	String course;	
	double aasMarks;
	double javaMarks;
	double pythonMarks;
	double totalMarks;
	double percentage;	

	Student(){
		this.id=0;
		this.name="Unknown";
		this.course="Not Assigned";
		this.aasMarks=0;
		this.javaMarks=0;
		this.pythonMarks=0;	
	}
	Student(int id, String name, String course, double aasMarks, double javaMarks, double pythonMarks){
		this.id=id;
		this.name=name;
		this.course=course;
		this.aasMarks=aasMarks;
		this.javaMarks=javaMarks;
		this.pythonMarks=pythonMarks;	
	}
	
	public void acceptDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Students id: ");
		this.id=sc.nextInt();

		 System.out.print("Enter Students name: ");
		this.name=sc.nextLine();

		System.out.print("Enter Students course: ");
		this.course=sc.nextLine();

		System.out.print("Enter Students aasMarks: ");
		this.aasMarks=sc.nextDouble();

		System.out.print("Enter Students javaMarks: ");
		this.javaMarks=sc.nextDouble();

		System.out.print("Enter Students pythonMarks: ");
		this.pythonMarks=sc.nextDouble();
		sc.close();
	}

	public void calculateTotal(){
		this.totalMarks= this.aasMarks+this.javaMarks+this.pythonMarks;
		System.out.println("Total Marks is: "+this.totalMarks);
	}
	
	public void calculatePercentage(){
		this.percentage= this.totalMarks/3;
		System.out.println("percentage is: "+this.percentage+"%");

	}
	
	void displayDetails(){
		System.out.println("Student name is: "+this.id);
		System.out.println("Student name is: "+this.name);
		System.out.println("Student name is: "+this.course);
		System.out.println("Student name is: "+this.aasMarks);
		System.out.println("Student name is: "+this.javaMarks);
		System.out.println("Student name is: "+this.pythonMarks);
		calculateTotal();
		calculatePercentage();
	}

	public static void main(String[] cp){
		
		Student s1 = new Student();
		s1.displayDetails();

		Student s2 = new Student(101,"mayank","Cs",75,85,45);
		s2.displayDetails();
		
		
	}	
	
}