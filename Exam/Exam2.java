class Stud
{
	void print(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread
{
	Stud s;
	Thread1(Stud s)
	{
		this.s=s;
	}
	public void run()
	{
		s.print(5);
	}
}
class Thread2 extends Thread
{
	Stud s;
	Thread2(Stud s)
	{
		this.s=s;
	}
	public void run()
	{
	
		s.print(8);
	}
}
class Thread3 extends Thread
{
	Stud s;
	Thread3(Stud s)
	{
		this.s=s;
	}
	public void run()
	{
		s.print(6);
	}
}
public class Exam2
{
	public static void main(String[] args)
	{
		Stud obj=new Stud();
		Thread1 t=new Thread1(obj);
		Thread2 t1=new Thread2(obj);
		Thread3 t2=new Thread3(obj);
		t.start();
		t1.start();
		t2.start();
	}
}
	
	