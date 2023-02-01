import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class FileBufferedInputStreamExample
 {
public static void main(String[] args)
{
try {  
  FileInputStream fis = new FileInputStream("D:\\File5.txt"); 
  BufferedInputStream bis = new BufferedInputStream(fis);
 
 int value = 0;    
 while((value = bis.read())!=-1)
 {    
     System.out.print((char)value);
	 //System.out.print(value1);
 }    
bis.close();    
} catch(Exception e){
  System.out.println(e);
 } 
 }
}