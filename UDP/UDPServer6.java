import java.net.*;
import java.io.*;
class UDPServer6 
{
	public static void main(String args[])
	{
		DatagramSocket ds = null;
		if (args.length < 1) 
		{
			System.out.println("Usage: java UDPServer <Port Number>");
			System.exit(1);
		}
		try 
		{
			int port = Integer.valueOf(args[0]).intValue();
			ds = new DatagramSocket(port);
			byte[] buffer = new byte[1000];
			while(true) 
			{
				DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
				ds.receive(dp);
				System.out.println("Msg Recieved from the Client is: " + (new String(dp.getData())).trim());
				//DatagramPacket reply = new DatagramPacket(dp.getData(),dp.getLength(),dp.getAddress(),dp.getPort());
				
				DatagramPacket reply = new DatagramPacket("Thank you".getBytes(), "Thank you".length(),dp.getAddress(),dp.getPort());
				ds.send(reply);
			}
		}
		catch (SocketException e) 
		{
			System.out.println("Socket: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("IO: " + e.getMessage());
		}
		finally 
		{
			if (ds != null)
				ds.close();
		}
	}
}