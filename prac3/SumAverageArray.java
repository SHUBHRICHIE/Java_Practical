import java.util.Scanner;
class SumAverageArray{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be stored in 1D Array: ");
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.println("Enter Elements");

		int sum=0;
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		double avg=(double)sum/n;
		System.out.println("Sum= "+ sum);
		System.out.println("Average= "+ avg);
	}
}