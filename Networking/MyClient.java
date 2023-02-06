import java.io.*;  
import java.net.*;  
public class MyClient {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  

// Stream is conceptually a pipeline in which elements are computed on demand.
//DataOutputStream is a filter output stream that provides methods for 
		//writing Java’s standard data types.
// It enables conveniently to write strings and all primitive data types such as 
		//boolean, int, float, long, etc to a stream.
//Java DataOutputStream first converts primitive-type values or strings into bytes 
		//and then writes them to the underlying output stream in an appropriate way.
		
//writeUTF - accepts a String value as a parameter and writes it in using modified UTF-8 encoding, 
		//to the current output stream
		
//Unicode (UTF) − Stands for Unicode(specific number for a letter or symbol etc )Translation/transformation Format