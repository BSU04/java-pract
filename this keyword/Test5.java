public class Test5 
{ 
   void m1(Test5 t) // Declare an instance method whose a parameter is t with class type Test. 
   { 
      System.out.println("m1 method is called"); 
   } 
 
   void m2()  
   { 
     m1(this); // Passing this as an argument in the m1 method. this keyword will pass the reference of current class object to the m1 method. 
   } 

public static void main(String[] args) 
{ 
   Test5 t = new Test5(); 
   t.m2(); 
  } 
}
