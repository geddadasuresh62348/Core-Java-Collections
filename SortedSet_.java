package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_ {

	public static void main(String[] args) {
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("e");
		ss.add("d");
		ss.add("c");
		ss.add("b");
		ss.add("a");
		ss.add("f");
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet("d"));
		System.out.println(ss.tailSet("e"));
		System.out.println(ss.subSet("c", "e"));	
	}
}
