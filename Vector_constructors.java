package collections_List;

import java.util.Vector;

public class Vector_constructors {

	public static void main(String[] args) {
		Vector<String> vt=new Vector<String>();
		System.out.println(vt.capacity()); // 10
		
		Vector<String> vt1=new Vector<String>(2);
		System.out.println(vt1.capacity());
		vt1.add("a");
		vt1.add("b");
		vt1.add("c");
		System.out.println(vt1.capacity());
		// adding one vector into another vector
		Vector<String> vt2=new Vector<String>(vt1);
		vt2.add("d");
		vt2.add("e");
		System.out.println(vt2.capacity());
	}
}
