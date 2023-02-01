import java.io.FileInputStream;
public class FileInputStreamExample {
public static void main(String[] args)
{
try {  
  FileInputStream fis = new FileInputStream("D:\\Filef3.txt"); 
 
 int value = 0;    
 while((value = fis.read())!=-1)
 {    
     System.out.print((char)value);
	 //System.out.print(value1);
 }    
fis.close();    
} catch(Exception e){
  System.out.println(e);
 } 
 }
}