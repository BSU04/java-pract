import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class FileBufferedOutputStreamExample {
public static void main(String[] args)
{
try { 
// Create an object of DataInputStream to attach keyboard to DataInputStream.
   DataInputStream dis = new DataInputStream(System.in); 	 
   	
// Store the filepath into the variable filepath of type String.   
   String filepath = "D:\\File5.txt";

// Create an object of FileOutputStream to attach myfileout file to FileOutputStream.   
   FileOutputStream fos = new FileOutputStream(filepath); 
   System.out.println("Enter the text (@at the end)");
   
   BufferedOutputStream bos = new BufferedOutputStream(fos);
   
   
    int value = 0;
// Read the values (in byte form) from dis into ch and write them into fos.    
   while((value = dis.read()) != '@'){
   char ch = (char)value; // Converting byte values into characters. 
   bos.write(ch);  
   
  }
	bos.flush();
  bos.close(); // Closing file.   
  System.out.println("Successfully written...");    
 }catch(Exception e){
   System.out.println(e);
 }    
 }
}