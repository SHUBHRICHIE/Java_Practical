import java.util.Scanner;

class Product_Diagonal_Column{

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

int d=1;
System.out.println("the product of diagonal element is");
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		if(i==j){
			d=d*arr[i][j];
		}
	}
}
System.out.println(d);

System.out.println("the product of column element is");
for(int i=0;i<a;i++){
	int c=1;
	for(int j=0;j<b;j++){
		c=c*arr[j][i];
	}
	System.out.println(c);
}

}
}