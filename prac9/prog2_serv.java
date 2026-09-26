import java.net.*;

class UDPServer{
	public static void main(String[] args)throws Exception{
		DatagramSocket serverSocket=new DatagramSocket(4444);
		System.out.println("UDP server is running and waiting for response...");
		
		byte[] receiveData=new byte[1024];

		DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
		serverSocket.receive(receivePacket);

		String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Client says: " + clientMessage);

	    InetAddress clientAddress = receivePacket.getAddress();
    	int clientPort = receivePacket.getPort();

		String replyMessage="Hello client, received your message";
		byte[] sendData=replyMessage.getBytes();

		DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
		serverSocket.send(sendPacket);

		serverSocket.close();
		System.out.println("Server closed");
	}	
}