class CD 
{ 
 CD() 
 { 
   this(5); // Calling parameterized constructor from default constructor. 
   System.out.println("Guess: First or Second?"); 
 } 
CD(int x) 
{ 
  System.out.println(x); 
  System.out.println("Gues: First or Second"); 
 } 
} 
public class ParameterizedConstructor 
{ 
  public static void main(String[] args) 
  { 
    CD cd = new CD(); 
  } 
}
