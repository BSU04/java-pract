import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class College  implements Serializable 
{
  String name;
  int strength;
  float nacscore;
  String doest;
  String location;
}
public class SerializationExample {
public static void main(String[ ] args) throws IOException 
{
    College clg = new College();
     clg.name = "Rajagiri";
     clg.strength = 2000;
     clg.nacscore = 3.81f;
     clg.doest = "01-01-1965";
     clg.location = "Kalamassery, Kochi";

     FileOutputStream fos = new FileOutputStream("D:\\file1.txt");// Create an object of FileOutputStream class to connect file1.txt file.
  
     ObjectOutputStream oos = new ObjectOutputStream(fos);// Create an object of ObjectOutputStream class to connect with fos.
   
     oos.writeObject(clg);// Call writeObject() method of ObjectOutputStream class.
     oos.flush();
     oos.close();
     System.out.println("Serialization is done successfully...");
  }
}