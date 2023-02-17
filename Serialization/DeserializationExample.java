
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
public static void main(String[] args) throws IOException, ClassNotFoundException 
{
// Create an object of FileInputStream class to connect file.txt file.
     FileInputStream fis = new FileInputStream("D:\\file1.txt");	

// Create an object of ObjectInputStream to connect with fis.
     ObjectInputStream ois = new ObjectInputStream(fis);
   
   Object obj = ois.readObject(); // Reading objects.
   College clg = (College)obj; // Converting to College.
   
   System.out.println("Name: " +clg.name);
   System.out.println("College Strength: " +clg.strength);
   System.out.println("College Nac Score: " +clg.nacscore);
   System.out.println("College Established: " +clg.doest); 
   System.out.println("College Location: " +clg.location);
 }
}