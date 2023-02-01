// A generic class to store any type of object. 

class Myclass<T> //T is a type parameter that will be replaced by a real (concrete) type when an object of type Myclass is created.
{
    T obj; // Declaring an object of type T.

     Myclass(T obj) // Declare a constructor to initialize T type object. 
    {
           this.obj = obj; 
    }

     T getObject() // Declare an instance method that will return T type object. 
    {
	  return obj; 
    }
}

public class GenericsTest 
{
public static void main(String[] args) 
{
     Integer i = 20; // Create an object of Integer class.
	// This is same as: Integer i = new Integer(20);
  
     Myclass<Integer> obj = new Myclass<Integer>(i);// Create an object of Myclass and store Integer object into it.
	// Call getObject() method to get Integer object.   
     System.out.println("Stored value: " +obj.getObject());   


     Double d = 20.25; // create an object of Double Type
	// Same as Double d = new Double(20.25);
     Myclass<Double> obj2 = new Myclass<Double>(d);// creating second object of MyClass and storing double object into it
     System.out.println("Stored value: " +obj2.getObject());

     String str = "Rajagiri";// to store String type data also
     Myclass<String> obj3 = new Myclass<String>(str);
     System.out.println("Stored value: " +obj3.getObject());
  }
}