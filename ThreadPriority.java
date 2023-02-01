public class ThreadPriority implements Runnable
{
public void run()
{
  System.out.println(Thread.currentThread()); // This method is static.
}
public static void main(String[] args) 
{
 ThreadPriority a = new ThreadPriority();
 Thread t1 = new Thread(a, "First Thread");
 Thread t2 = new Thread(a, "Second Thread");
 Thread t3 = new Thread(a, "Third Thread");
 
 t2.setPriority(2); 
 t1.setPriority(5); 
 t3.setPriority(8); 
 
 t1.start();
 t2.start();
 t3.start();
  }
}