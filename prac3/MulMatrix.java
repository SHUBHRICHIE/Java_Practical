import java.util.Scanner;

class MulMatrix{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		

		System.out.println("matrix:1");
		System.out.print("Enter number of rows: ");
		int rows1 = sc.nextInt();
		System.out.print("Enter number of cols: ");
		int cols1 = sc.nextInt();
		
		int matrix1[][] = new int[rows1][cols1];

		for(int i = 0;i<rows1;i++){
			for(int j = 0;j<cols1;j++){
				System.out.print("Enter number for row "+i+" and col "+j+" : ");
				matrix1[i][j] = sc.nextInt(); 
			}
		}

		System.out.println("matrix:2");
		System.out.print("Enter number of rows: ");
		int rows2 = sc.nextInt();
		System.out.print("Enter number of cols: ");
		int cols2 = sc.nextInt();
		
		int matrix2[][] = new int[rows2][cols2];

		for(int i = 0;i<rows1;i++){
			for(int j = 0;j<cols1;j++){
				System.out.print("Enter number for row "+i+" and col "+j+" : ");
				matrix2[i][j] = sc.nextInt(); 
			}
		}
		if(rows1==cols2){
			int mulMat[][] = new int[rows1][cols2];
			for(int i = 0; i<rows1;i++){
				for(int j=0; j<cols2;j++){
					for(int k=0; k<cols1;k++){
						mulMat[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			for(int i = 0;i<rows1;i++){
				for(int j = 0;j<cols2;j++){
					System.out.print(" "+mulMat[i][j]+" ");
				}System.out.println();
			}	
		} 

		
		
		
		
		
		
		
		
	}




}