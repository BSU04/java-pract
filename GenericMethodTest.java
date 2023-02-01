// A generic method used to read and display any type of array elements.

class Myclass 
{
  public static <T> void display(T[] array)//generic method receives the T type array
  {
	 for(T t : array) // reading elements of the array
	 {
	  System.out.print(t+ " ");	 
	 }
   System.out.println();	 
  }
}

public class GenericMethodTest {
public static void main(String[] args)
{
     Integer[ ] arr1 = {100, 200, 300, 400, 500, 600};//Reading elements of array of Integer type
     System.out.println("Reading Integer objects: ");
     Myclass.display(arr1);
   
     Double[ ] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};// Read elements of array of Double type
     System.out.println("Reading Double objects: ");
     Myclass.display(arr2);
   
     String[ ] arr3 = {"Rajagiri", "College", "of", "Social", "Sciences"};// Read elements of array of String type
     System.out.println("Reading String objects: ");
     Myclass.display(arr3);
  }
}