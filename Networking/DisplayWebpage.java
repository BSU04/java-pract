import java.io.*;    
import java.net.*;    
public class DisplayWebpage 
{    
	public static void main(String[] args)
	{ 
	int i;   
	try
	{    
		URL link=new URL("https://rajagiri.edu/");    
		URLConnection conn=link.openConnection();    
		InputStream s1 =conn.getInputStream();  // displaying the entire data of a webpage using getinputstream method 
	while((i=s1.read())!=-1)
		{    
			System.out.print((char)i);    
		}    
	}
	catch(Exception e)
	{
		System.out.println(e);
	}    
	}    
}    