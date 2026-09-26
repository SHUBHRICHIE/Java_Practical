import java.net.*;

class UDPClient{
	public static void main(String[] args) throws Exception{
		DatagramSocket clientSocket=new DatagramSocket();

		InetAddress ipAddress=InetAddress.getByName("localhost");
		int port =4444;
		
		String message="Hello server, this is a UDP message";
		byte[] sendData=message.getBytes();

		System.out.println("Sending message to server...");
		DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length, ipAddress, port);
		clientSocket.send(sendPacket);

		byte[] receiveData=new byte[1024];
		DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);

		clientSocket.receive(receivePacket);

		String serverResponse=new String(receivePacket.getData(), 0, receivePacket.getLength());
		System.out.println("Server says: "+serverResponse);
	
		clientSocket.close();
	}
}