class Table 
{
  void printTable(int x)
 {
    synchronized(this) // Synchronized block.
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
   }  
 }}
}  
}
class Thread1 extends Thread
{
  Table t;
  Thread1(Table t)
 {
    this.t = t;	
  }
public void run()
{  
     t.printTable(2);
 }  
}
class Thread2 extends Thread
{
  Table t;
  Thread2(Table t)
  {
      this.t = t;	
   }	
public void run()
{  
    t.printTable(10); 
 }  
}
public class SynchronizedBlock
{
public static void main(String[] args) 
{
   Table t = new Table();	
   Thread1 t1 = new Thread1(t);
   Thread2 t2 = new Thread2(t);
     t1.start(); 
     t2.start();
   }
}