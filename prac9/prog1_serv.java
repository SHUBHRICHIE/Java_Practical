import java.net.*;
import java.io.*;

class MyServer{
	public static void main(String args[]) throws Exception{
		ServerSocket ss=new ServerSocket(3333);
		System.out.println("Server is waiting for client...");
		Socket s=ss.accept();
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());

		String str=din.readUTF();
		System.out.println("Clinet sent number: "+str);

		int num=Integer.parseInt(str);
		
		int originalNum=num;
		int sum=0;
		int digits=String.valueOf(num).length();
		
		while(num>0){
			int remainder=num%10;
			sum+=Math.pow(remainder, digits);
			num/=10;
		}		
	
		String response="";
		if(sum==originalNum){
			response=originalNum+" is an Armstrong number";
		}else{
			response=originalNum+" is not an Armstrong number";
		}

		dout.writeUTF(response);
		dout.flush();

		din.close();
		dout.close();

		s.close();
		ss.close();
	}
}