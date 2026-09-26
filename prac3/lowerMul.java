import java.util.Scanner;

class lowerMul{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of cols: ");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];

		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				System.out.print("Enter number for row "+i+" and col "+j+" : ");
				matrix[i][j] = sc.nextInt(); 
			}
		}
	                                   	
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(i>j){
					System.out.print(matrix[i][j]+"  ");
				}
				else{
					System.out.println(" ");
				}		
			}
				System.out.println();
		}
			
	}
}