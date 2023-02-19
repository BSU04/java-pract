import java.util.Scanner;
public class ExceptionHandling1 
{
public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter two integer numbers");

  int num1 = sc.nextInt();
  int num2 = sc.nextInt();

  System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
  }
}