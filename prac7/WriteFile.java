import java.io.*;
import java.util.Scanner;

class WriteFile{
	public static void main(String[] cp){
		try{
			System.out.println("Enter the lines");
			Scanner reader = new Scanner(System.in);
			FileWriter writer = new FileWriter("JavaFile1.txt");
			
			while(reader.hasNextLine()){
				String data = reader.nextLine();
				writer.write(data+"\n");
			}
			writer.close();
			reader.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}


}