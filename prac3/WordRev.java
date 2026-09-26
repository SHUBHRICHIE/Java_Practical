import java.util.Scanner;
import java.util.StringTokenizer;

class WordRev{
	public static String reverseWord(String word){
		String rev="";

		for(int i = word.length()-1;i>=0;i--){
			rev+=word.charAt(i);
		}
		return rev;	
	}



		
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(sentence);

		StringBuilder result = new StringBuilder();
		
		while(st.hasMoreTokens()){
			String word = st.nextToken();
			
			String reversed = reverseWord(word);
			result.append(reversed).append(" ");
		}
		System.out.println("Output: " + result.toString().trim());
		sc.close();
	}
}