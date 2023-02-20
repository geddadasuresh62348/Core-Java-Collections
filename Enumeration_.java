package list;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_ {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		System.out.println(v);
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
