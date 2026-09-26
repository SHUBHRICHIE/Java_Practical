import java.net.*;
import java.io.*;

class myClient{
	public static void main(String[] args) throws Exception{
		Socket s=new Socket("localhost",3333);

		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number to check: ");
		String str=br.readLine();

		dout.writeUTF(str);
		dout.flush();

		String response=din.readUTF();
		System.out.println("Server says: "+response);

		dout.close();
		din.close();
		s.close();
	}
}