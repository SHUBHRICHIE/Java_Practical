import java.util.Scanner;

	class AnagramCheck{
		public static void main(String []cp){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First string: ");
		String string1 = scanner.nextLine().toLowerCase();
		
		System.out.print("Enter Second string: ");
		String string2 = scanner.nextLine().toLowerCase(); 
	
		if(string1.length()!=string2.length()){
			System.out.println("Not an Anagram");
			return;
		}
		
		String visited= "";
		boolean isAnagram=true;

		for(int i=0;i<string1.length();i++){
			char ch = string1.charAt(i);
			boolean found = false;
			
			for(int j=0;j<string2.length();j++){
				if(ch==string2.charAt(j) && !visited.contains(","+ j +",")){
					found = true;
					visited += ","+j+",";
					break;
				}
			}
			
			if(!found){
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram){
			System.out.println("Its Anagram");
		}
		else{
			System.out.println("Not an Anagram");
		}
		
	
	}



}