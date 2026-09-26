	
class StudentMgmt{
	int rollNo;
	String studentName;
	static String collegeName = "mithibai";
	static int countStudent = 0;
	 
	public StudentMgmt(int rollNo, String studentName){
		this.rollNo=rollNo;
		this.studentName=studentName;	
		countStudent++;
	}

	public void display(){
		System.out.println("Student Name is : "+studentName);
		System.out.println("Student roll no is : "+rollNo);
		System.out.println("Student college name is : "+collegeName);
	}
	
	public static void totalStudents(){
		System.out.println("Student count is : "+countStudent);

	}

	public static void main(String[] args){
		StudentMgmt s1 = new StudentMgmt(101,"Alpha");
		StudentMgmt s2 = new StudentMgmt(102,"Beta");
		StudentMgmt s3 = new StudentMgmt(103,"Gamma");

		s1.display();
		s2.display();
		s3.display();
		
		totalStudents();
	}


}
