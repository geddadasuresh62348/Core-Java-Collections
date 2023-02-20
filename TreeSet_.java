package set;
import java.util.*;
public class TreeSet_ {

	public static void main(String[] args) {
//constructors:-
//1.public TreeSet():-
		TreeSet<String> ts=new TreeSet<String>();
//2.public TreeSet(Collection c):-
		ArrayList<String> al=new ArrayList<String>();
		al.add("e");
		al.add("d");
		al.add("c");
		al.add("b");
		al.add("a");
		al.add("f");
		System.out.println(al);
		TreeSet<String> ts1=new TreeSet<String>(al);
		System.out.println(ts1);
		
	}
}
