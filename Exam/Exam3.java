import java.io.*;
import java.util.*;
class Student implements Serializable
{
	String name;
	int age;
	String dept;
}
class Exam3
{
	public static void main(String[] args)throws Exception
	{
		Student s=new Student();
		Scanner scn=new Scanner(System.in);
		s.name=scn.nextLine();
		s.dept=scn.nextLine();
		s.age=scn.nextInt();
		
		System.out.println("Name is:" +s.name);
		System.out.println("Age is:" +s.age);
		System.out.println("Dept is:" +s.dept);
		
		FileOutputStream fos=new FileOutputStream("file5.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
		
		
		System.out.println("Serialized");
		
		FileInputStream fis=new FileInputStream("file5.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("Deserialized");
		
		System.out.println("Name is:" +s.name);
		System.out.println("Age is:" +s.age);
		//System.out.println("Dept is:" +s.dept);
	}
}
		