package maps;
import java.util.*;
public class HashMap_ {

	public static void main(String[] args) {
// constructors:- 
//1.public HashMap():- Used to create an empty HashMap
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
		System.out.println(hp);
		
//2.public HashMap(int capacity):- Used to create HashMap with our own capacity
		HashMap<Integer,String> hp1=new HashMap<Integer,String>(10);
		System.out.println(hp1);
		
//3.public HashMap(int capacity float loadfactor):- Used to create HashMap with our own capacity
		HashMap<Integer,String> hp2=new HashMap<Integer,String>(10,0.80f);
		System.out.println(hp2);

//4.public HashMap(map c):- Used to create HashMap with our own capacity
		HashMap<Integer,String> hp3=new HashMap<Integer,String>(10,0.80f);
		hp3.put(1, "aaa");
		hp3.put(2, "bbb");
		hp3.put(3, "ccc");
		HashMap<Integer,String> hp4=new HashMap<Integer,String>(hp3);
		System.out.println(hp3);
		System.out.println(hp4);
	}

}
