import java.io.*;
import java.util.Scanner;

public class CopyFile{
	public static void main(String []cp){
		try{
			File obj = new File("JavaFile1.txt");
			Scanner reader = new Scanner(obj);
			FileWriter writer = new FileWriter("JavaFile2.txt");
			
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
