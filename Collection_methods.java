package collection_methods;
import java.util.*;
public class Collection_methods {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
//1.public boolean add():-
		System.out.println(hs.add("abc"));//true
		System.out.println(hs.add("abc"));//false
		System.out.println(hs);
//2.public boolean addAll():-
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("aaa");
		hs1.add("bbb");
		System.out.println(hs1.addAll(hs));//-->returns true, If added atleast one element
		System.out.println(hs1.addAll(hs));//false
		System.out.println(hs);
		System.out.println(hs1);
//3.public boolean remove(object element):-
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.remove("a"));//-->true,Element is removed
		System.out.println(al);
		System.out.println(al.remove("an"));//-->False,Element is not removed or not found
//4.public boolean removeAll(Collection c):-
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		al1.add("ddd");
		al1.add("eee");
		al1.add("eee");
		al1.add("fff");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
//		System.out.println(al1.removeAll(al2));
//		System.out.println(al1.removeAll(al2));
		ArrayList<String> al3=new ArrayList<String>();
		al3.add("aaa");
		al3.add("xxx");
		al3.add("yyy");
		System.out.println(al1.removeAll(al3));//--> Even if it removes single value it returns 'true'
		al1.add("aaa");
		System.out.println("al1 :-"+al1);
		System.out.println();
//5.public boolean contains(Object obj):-
		System.out.println(al3.contains("aaa"));
//6.public boolean containsAll(Collection c):-
		System.out.println(al1.containsAll(al3));//false ,al1 doesn't contain all the elements of al3
		System.out.println();
	}
}
