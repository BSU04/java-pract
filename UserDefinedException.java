import java.util.Scanner;
class InvalidAgeException extends Exception
{
  InvalidAgeException(String str)// Declare a parameterized exception with string str as a parameter.
  {
	super(str);
  }
}

public class UserDefinedException 
{
private static int age;
static void validate() throws InvalidAgeException// throws.....
{ 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age");
 age = sc.nextInt();

 if(age < 18)  
 throw new InvalidAgeException("Invalid Age, You are not eligible to vote");  // parametrised
 else  
 System.out.println("Welcome to vote");  
}  

public static void main(String[] args)
{
try
{  
 validate();  
}
catch(Exception e)
{
  System.out.println("Caught an Exception: \n "+e);
 }   
 }  
}