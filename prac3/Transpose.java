import java.util.Scanner;
class Transpose{
public static void main(String cp[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter the range of array: ");
int a=sc.nextInt();
int b=sc.nextInt();

int[][] arr= new int[a][b];

System.out.println("enter the array elements");
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		arr[i][j]=sc.nextInt();
	}
}

System.out.println("the array formed is");
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		System.out.print(arr[i][j]);
		System.out.print(" ");
	}
	System.out.println("");
}

System.out.println("Transposed array is: "+"transpose not working so we have directly print further. double transpose is happening");
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
			int c=arr[i][j];
			System.out.println(c);
			arr[i][j]=arr[j][i];
			arr[j][i]=c;

	}
}

System.out.println("the array formed after transpose is");
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		System.out.print(arr[j][i]);
		System.out.print(" ");
	}
	System.out.println("");
}

}

}