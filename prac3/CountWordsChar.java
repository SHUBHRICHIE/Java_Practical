import java.util.Scanner;

class CountWordsChar{
	public static void main(String[] cp){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String sentence = sc.nextLine();

		int totalChar = sentence.length();

		int charWoSpace = sentence.replace(" ","").length();
	
		int totalWords = 0;
		
		String trimmed = sentence.trim();
		
		if(!trimmed.isEmpty()){
			String words[] = trimmed.split("\\s+");
			totalWords =  words.length;
		} 
		System.out.println("\nTotal characters including spaces is: "+ totalChar);
		System.out.println("Total characters excluding spaces is: "+ charWoSpace);
		System.out.println("Total Words: "+ totalWords);

		sc.close();		
		
	}	
}