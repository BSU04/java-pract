import java.net.*;
import java.io.*;

class UDPClient6
{
	public static void main(String args[])
	{
		DatagramSocket ds = null;
		if (args.length < 3) 
		{
			System.out.println("Usage: java UDPClient <message> <Host name> <Port number>");
			System.exit(1);
		}
		try
		{
			ds = new DatagramSocket();
			byte [] m = args[0].getBytes();// message
			InetAddress shost = InetAddress.getByName(args[1]);// hostname
			int sport = Integer.valueOf(args[2]).intValue();// port number
			DatagramPacket dp =new DatagramPacket(m, args[0].length(), shost, sport);
			ds.send(dp);
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			ds.receive(reply);
			System.out.println("Reply from the server: " + (new String(reply.getData())).trim());
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