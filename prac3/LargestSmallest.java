import java.util.Scanner;
class LargestSmallest{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Enter 5 elements: ");
		for(int i=0; i<5; i++){
			arr[i]=sc.nextInt();
		}

		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0; i<5; i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
			if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("Largest element: "+ largest);
		System.out.println("Smallest element: "+ smallest);
	}
}