
public class Student1 
 { 
     String name;   //Declaration of instance variables i.e state of objects. 
     int rollNo; 
     int age; 

     Student1() //Declaration of a default constructor
     { 
       name = "Vinesh"; // Values initialization of state of objects
       rollNo = 05; 
       age = 22; 
     } 

     void display() //Declare an instance method
     { 
         System.out.println("Student's name:" +name); //  directly calling the instance variables as it is in instance area
         System.out.println("Student's roll no: " +rollNo); 
         System.out.println("Student's age:" +age); 
     } 
 
     public static void main(String[] args) 
     { 
 
     Student1 st = new Student1(); // call the default constructor. 
 
      st.display();
    } 
  }
