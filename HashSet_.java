package set;

import java.util.HashSet;

public class HashSet_ {

	public static void main(String[] args) {
//constructors:-
//1.public HashSet():-
		HashSet<String> hs=new HashSet<String>(4);
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("dd");
		hs.add("ee");
		hs.add("ff");
		System.out.println(hs);

//2.public HashSet(int capacity):-
//3.public HashSet(int capacity,float loadfactor):-
		HashSet<String> hs1=new HashSet<String>(10,0.90f);
		
//4.public HashSet(Collection c):-
		HashSet hs2=new HashSet(hs);
		hs2.add(10);
		hs2.add(null);
		hs2.add(null);
		System.out.println(hs2);
		
	}
}
