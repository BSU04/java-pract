import java.io.*;
import java.io.IOException;
public class FileInformation
{
	public static void main(String[] args)
	{
	//boolean yesorno; 
	File f = new File("D:\\Filef2.txt");
	try
	{
	//yesorno = f.createNewFile();
	f.createNewFile();
	if (f.exists()) //(yesorno)
	{
	  System.out.println("File Name: " + f.getName());
	  System.out.println("Path: " + f.getAbsolutePath());
	  System.out.println("Writeable: " + f.canWrite());
	  System.out.println("Readable: " + f.canRead());
	  System.out.println("File Size in Bytes: " + f.length());
	}
	else
	{
		System.out.println("File Doesnot Exits" );
	}
	}
	catch (IOException e)   
	{  
	e.printStackTrace();    //prints exception if any  
	}   
	}
}
