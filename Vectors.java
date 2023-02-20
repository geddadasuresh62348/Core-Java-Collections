package list;

import java.util.ArrayList;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
//1. public vector():- 
//It can be used to construct an empty vector object with the default capacity value 10
		Vector<String> v=new Vector<String>();
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		
//2. Every time doubling the capacity value:-
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println(v1.capacity());
		for(int i=0;i<=11;i++) {
			v1.add(i);
		}
		System.out.println(v1.capacity());
		for(int i=12;i<=21;i++) {
			v1.add(i);
		}
		System.out.println(v1.capacity());
		
//2. public vector(int capacity,int incremental capacity ratio):-
		System.out.println();
		Vector<Integer> v2=new Vector<Integer>(10,5);
		System.out.println(v2.capacity());
		for(int i=0;i<=11;i++) {
			v2.add(i);
		}
		System.out.println(v2.capacity());
		for(int i=12;i<=19;i++) {
			v2.add(i);
		}
		System.out.println(v2.capacity());
		for(int i=17;i<21;i++) {
			v2.add(i);
		}
		System.out.println(v2.capacity());
		
//3.public Vector(Collection c):-
		System.out.println();
		ArrayList arr=new ArrayList();
		arr.add("n");
		arr.add(true);
		arr.add(12);
		arr.add(null);
		arr.add(null);
		System.out.println(arr);
		Vector v3=new Vector(arr);
		System.out.println(v3);

// Methods:-
//1.public void addElement(Object element):-
		Vector<String> vv=new Vector<String>();
		vv.add("a");
		vv.add("b");
		vv.add("c");
		System.out.println(vv);
		vv.addElement("d");
		vv.addElement("e");
		System.out.println(vv);
//2.public Object firstElement():-
		System.out.println(vv.firstElement());// returns firstElement
		
//3.public Object lastElement():-
		System.out.println(vv.lastElement());// returns lastElement
		
//4.public Object remove():-
		System.out.println(vv.remove("a"));// it removes particular element
		
//5.public void removeElementAt():-		
		vv.removeElementAt(2);// removes elements at index 2
		System.out.println(vv);
		
//6.public void removeAllElements():-
		vv.removeAllElements();// it removes all elements
		System.out.println(vv);
	}
}
