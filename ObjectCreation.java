public class ObjectCreation
{ 
     void display() 
    { 
       System.out.println("Declaration of Instance method");
    }

public static void main(String[] args)
{ 
 // Create three objects of class to access the same method. 
	ObjectCreation o1 = new ObjectCreation();
	ObjectCreation o2 = new ObjectCreation();
	ObjectCreation o3 = new ObjectCreation();
      

// Call instance method display() using reference variable o1, o2, and o3. 
     o1.display();
     o2.display(); 
     o3.display(); 
 } 
}
