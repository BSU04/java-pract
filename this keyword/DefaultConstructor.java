class ABC 
{ 
 
   ABC() 
   { 
     System.out.println("Rajagiri"); 
   } 

   ABC(int x) 
   { 
     this(); // Must be the first line in the constructor. // Calling default constructor of class ABC from parameterized constructor. 
     System.out.println("College "+x); 
   } 
} 
public class DefaultConstructor 
{ 
  public static void main(String[] args) 
  { 
    ABC obj = new ABC(1965); 
  } 
}
