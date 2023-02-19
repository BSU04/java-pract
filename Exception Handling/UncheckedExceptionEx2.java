public class UncheckedExceptionEx2 
{ 
public static void main(String[] args) 
{ 
try 
{ 
 int x[ ] = {1, 2, 3, 4}; 
 System.out.println(x[6]); 
} 
catch(ArrayIndexOutOfBoundsException e)
{ 
  System.out.println("Specified index does not exist. " + "Please correct the error."); 
 } 
}
}