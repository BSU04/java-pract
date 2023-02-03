public class finallyBlockExample1 
{
public static void main(String[] args) 
{ 
 int a = 20, b = 10; 
try 
{ 
 System.out.println("Value of a: " +a); 
 System.out.println("Value of b: " +b); 
 int div = a/b; 
 System.out.println("Division: " +div); 
} 
catch(ArithmeticException ae) 
{ 
  System.out.println(ae); // prints corresponding exception. 
 } 
finally 
{ 
  System.out.println("Denominator cannot be zero"); 
 } 
System.out.println("ArithmeticException is caught and comes to finally"); 
 } 
}