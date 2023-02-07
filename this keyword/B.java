class A 
{ 
   B obj; //Declare a parameterized constructor
   A(B obj)  //parameter is obj with class type B.
   { 
     this.obj = obj; 
   } 

void show() 
{ 
  System.out.println("Show method is called"); 
  System.out.println("Value of b: " +obj.b); 
 } 
} 

class B 
{ 

    int b = 30; 
    B() 
    { 
 
      A a = new A(this);  // Create an object of class A and pass this as an argument to call the constructor of class A. 
			  // this keyword will pass the reference of the current class object. Here, B is the current class object. 
      a.show(); 
    } 
public static void main(String[] args) 
 { 
     B obj = new B(); 
   } 
 }
