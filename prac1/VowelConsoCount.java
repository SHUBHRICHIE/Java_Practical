import java.util.Scanner;


class VocoCount{
	public static void main(String[] cp){	
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the sentence: ");
	String sentence = scanner.nextLine();

	char[] vowels= {'a','e','i','o','u'};

	int vowelsCount=0;
	int constCount=0;

	for(int i=0;i<sentence.length();i++){
		char ch= Character.toLowerCase(sentence.charAt(i));

		if(ch>='a' && ch<='z'){
			boolean foundVowel=false;
			
			for(int j=0;j<vowels.length;j++){
				if(ch == vowels[j]){
					vowelsCount++;
					foundVowel=true;
					break;}
				}
			if(!foundVowel){
				constCount++;}
			}		
		}
		System.out.println("Vowel count in sentence is "+ vowelsCount);
		System.out.println("consonants count in sentence is "+ constCount);
	
	scanner.close();
	
	}
}