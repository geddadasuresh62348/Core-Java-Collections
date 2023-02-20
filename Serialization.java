package maps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
}
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Employee e=new Employee(1, "krupavarma");
		// serializing the Employee object : writing the object to file
		FileOutputStream outputStream=new FileOutputStream("abc.txt");
		ObjectOutput objectOutputStream=new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(e);
		objectOutputStream.close();
		System.out.println("Serialization process completed");
		
		// deserialization of Employee object : reading the object from file
		FileInputStream inputStream=new FileInputStream("abc.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
		Employee emp=(Employee) objectInputStream.readObject();
		System.out.println(e.eid +" "+e.ename);
		objectInputStream.close();
		System.out.println("Deserialization process completed..");
	}
}
