public class MyThread implements Runnable
{
 public void run()
 {
  System.out.println("New thread running ");
  for(int i = 1; i <= 5; i++)
  {
   System.out.println(i);  
  }
 System.out.println(Thread.currentThread());
}
public static void main(String[] args)
{
 System.out.println("Main thread running");	 

 
   MyThread th = new MyThread();// Create an object of MyThread class.	
  
   Thread t = new Thread(th);// / Create an object of Thread class and pass reference variable th to Thread class constructor. 
   
   t.start(); // This thread will execute statements inside run() method of MyThread object.
 }
}