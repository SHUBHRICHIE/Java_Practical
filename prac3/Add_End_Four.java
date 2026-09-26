import java.util.Scanner;
class Add_End_Four{

public static void main(String cp[]){

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


System.out.println("sum of elements is");
int sum=0;
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		if(arr[i][j]%10==4){
			sum=sum+arr[i][j];
		}
	}
}
System.out.println(sum);
}

}