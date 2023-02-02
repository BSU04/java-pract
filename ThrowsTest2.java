import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsTest2 
{
 private String firstName, lastName;
 void accept() throws IOException
 {
// Reading data from keyboard.
  InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  
  System.out.println("Enter your first name");
  firstName = br.readLine();// read a line from the text
  System.out.println("Enter your last name");
  lastName = br.readLine();
 }
 void display(){
   System.out.println("Full Name: " +firstName+ " " +lastName);
 }
public static void main(String[] args) throws IOException
{
 ThrowsTest2 obj = new ThrowsTest2();
  obj.accept();
  obj.display();
  }
}