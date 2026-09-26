import java.io.*;
import java.util.Scanner;

class FindWordInFile{
	public static void main(String []cp){
		Scanner reader,sc;
		int count = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the target word: ");
		String target = sc.next().trim();
		
		try{
			File f = new File("firsttext");
			reader = new Scanner(f);
			
			while(reader.hasNext()){
				String word = reader.next();
				word = word.replace(",","").replace(".","").replace("?","").replace("!","");
				
				if(word.equalsIgnoreCase(target)){
					count++;
				}
			}
			sc.close();
			reader.close();
			System.out.println("Total word count of "+target+" in the file is: "+count);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}