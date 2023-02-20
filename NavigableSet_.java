package set;

import java.util.*;

public class NavigableSet_ {

	public static void main(String[] args) {
		NavigableSet<String> ns=new TreeSet<String>();
		ns.add("e");
		ns.add("d");
		ns.add("c");
		ns.add("b");
		ns.add("a");
		ns.add("f");	
		System.out.println(ns);
// Methods :-
//1.public NavigableSet descendingSet():-
		System.out.println(ns.descendingSet());
//2.public 
		System.out.println(ns.ceiling("b"));
		System.out.println(ns.higher("b"));
		System.out.println(ns.floor("b"));
		System.out.println(ns.lower("b"));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns);
		}

}
