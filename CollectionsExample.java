import java.util.*;

public class CollectionsExample {
  public static void main(String[] args) {
    
    Vector<Integer> Vec = new Vector<Integer>();

    Vec.add(10);
    Vec.add(20);
    Vec.add(30);
    System.out.println("Vec contains: " + Vec); 

    Collections.addAll(Vec, 40, 50);
    System.out.println("Vec contains: " + Vec); 

    Integer Arr[] = {60, 70};
    Collections.addAll(Vec, Arr);

    System.out.println("Vec contains: " + Vec);     
  }
}