import java.util.Scanner;

class SortNames{
	
	public static boolean sortAlgo(String word1, String word2){
		
		String w1= word1.toLowerCase();
		String w2= word2.toLowerCase();

		int len1 = w1.length();
		int len2 = w2.length();
		
		int minLength = (len1 < len2 ) ? len1 : len2;
		
		for (int i=0;i<minLength;i++){
			char c1= w1.charAt(i);
			char c2= w2.charAt(i);
			
			if(c1!= c2){
				return c1 > c2;
			}
		}
		return len1>len2;
	}
	




	
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of names you wish to enter: ");
		int size = sc.nextInt();
		sc.nextLine();

		String names[] = new String[size];
		
		System.out.println("Enter the names: ");
		for(int i=0;i<size;i++){
			names[i]=sc.nextLine();
		}
		
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(sortAlgo(names[j],names[j+1])){
					
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp; 
				}
			}
		}

		System.out.println("\nSorted Names are: ");
		for(int i=0;i<size;i++){
			System.out.println(names[i]);
		}	
		

		sc.close();
	}
}