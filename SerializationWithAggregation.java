import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {
	int i;

	public A(int i){
	this.i = i;
	}

	public A()//default constructor must be present otherwise we will get runtime exception
	{
		i = 50;
		System.out.println("A's class constructor called");
	}
}

class B extends A implements Serializable {//subclass B implementing Serializable interface
	int j;
	public B(int i, int j)
	{
		super(i);
		this.j = j;
	}
}

public class SerializationWithAggregation {
	public static void main(String[] args) throws Exception
	{
		B b1 = new B(10, 20);

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		// Serializing B's(subclass) object
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(b1);
		oos.close();
		fos.close();
		System.out.println("Object has been serialized");

		// De-Serializing B's(subclass) object
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		B b2 = (B)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}
