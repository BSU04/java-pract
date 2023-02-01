class Table 
{
synchronized static void printTable(int x) //static method is synchronized.
{
for(int i = 1; i <= 3; i++)
{  
 System.out.println(x * i);  
 try
 {  
   Thread.sleep(400);  
 }
catch(InterruptedException ie)
{
   System.out.println(ie);
 }  }
}  
}

class Thread1 extends Thread
{ 
public void run()
{  
   Table.printTable(2); // Calling synchronized static method using class name with passing argument 2.
 }  
}

class Thread2 extends Thread
{
public void run()
{  
  Table.printTable(10); // Calling synchronized static method using class name with passing argument 10.
 }  
}

public class SynchronizedStaticMethod
{
public static void main(String[] args) 
{
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();
 t1.start(); 
 t2.start();
 }
}