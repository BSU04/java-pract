public class NestedTryBlockEx1 
{
public static void main(String[] args) 
{ 
 String str = "Rajagiri"; 
 int x[ ] = {0, 1, 2, 3, 4}; 
try // Outer try block 
{ 
 // str = null; // Exception occurred. 
  int slength = str.length(); 
  System.out.println("String length: " +slength); 

try // Inner try block 
{ 
  int y = 6; 
  System.out.println(x[y]); 
} 
catch(ArrayIndexOutOfBoundsException aie) 
{
  System.out.println("Exception is thrown"); 
  System.out.println(aie.toString()); 
 } 
} 
catch(NullPointerException npe) 
{ 
  System.out.println("Exception is thrown "); 
  System.out.println(npe.toString()); 
  } 
 } 
}