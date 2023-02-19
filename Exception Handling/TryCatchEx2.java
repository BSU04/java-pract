public class TryCatchEx2
{ 
 int x = 30, y = 0; 
void divide() 
{ 
 System.out.println("I am in method"); 
try 
{ 
  System.out.println("I am in try block"); 
  int z = x/y; 
  System.out.println("Result of z: " +z); 
} 
catch(ArithmeticException ae) 
{ 
  System.out.println("I am in catch block"); 
 } 
}
public static void main(String[] args) 
{ 
 TryCatchEx2 obj = new TryCatchEx2(); 
 System.out.println("I am in main method"); 
  obj.divide(); 
 } 
}