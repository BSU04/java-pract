package MSC2;
import MSC1.*;
 
public class Demo{
    public static void main(String args[]) {
        int n=10, m=12;
        Compare current = new Compare(n, m);
        if(n != m) {
             current.getmax();
        }
        else {
            System.out.println("Both the values are same");
        }   
}
}