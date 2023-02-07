public class Msc2022
{ 
   Msc2022 show() // Declare an instance method show with return type Msc2022 (class type). 
   { 
      return this; 
   } 

void msg() 
{ 
  System.out.println("MSC 2022 is a good batch"); 
 } 

public static void main(String[] args) 
{ 
    new Msc2022().show().msg(); 
 } 
}
