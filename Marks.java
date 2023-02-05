 public class Marks 
  { 
     String subject1; // Declaring instance variables 
     int sub1Marks; 
     String subject2; 
     int sub2Marks; 

     public static void main(String[] args) 
     { 
       Marks mk = new Marks(); 
 
       mk.subject1 = "Science"; //Initialize values of objects through object reference variable.
       mk.sub1Marks = 90; 
       mk.subject2 = "Maths"; 
       mk.sub2Marks = 99; 

      int totalMarks = 90 + 99; 

      System.out.println("Marks in Science:" +mk.sub1Marks); 
      System.out.println("Marks in Maths:" +mk.sub2Marks); //call marks using object reference variable
      System.out.println("Total Marks: " +totalMarks); 
    } 
 }
