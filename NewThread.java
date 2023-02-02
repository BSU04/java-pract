public class NewThread extends Thread {// step 1 extending thread class
public 	void run() // Step 2 defining run method and it overides the run method of the class
{
 Thread th1 = Thread.currentThread();
 System.out.println(th1); 
  System.out.println("New thread strats running");
  System.out.println("I am in run() method");
}
public static void main(String[] args)
{
 System.out.println("Main thread starts running");	
 Thread ct1 = Thread.currentThread();
 System.out.println(ct1);
 
  int ac1 = Thread.activeCount();
  System.out.println(ac1);  


   NewThread nt = new NewThread();// Step 3: Create an object of NewThread class.
   int ac2 = Thread.activeCount();
   System.out.println(ac2);


   Thread t = new Thread(nt);// Step 4: Create an object of Thread class and pass the object reference variable nt.
   int ac3 = Thread.activeCount();
   System.out.println(ac3);

// Now run thread on the object. For this, call start() method using reference variable t.
   t.start(); //Step 5:  This thread will execute statements inside run() method of NewThread object.
   int ac4 = Thread.activeCount();
   System.out.println(ac4);
   t.setName("NewThread"); // Setting a new name of thread.
 }
}