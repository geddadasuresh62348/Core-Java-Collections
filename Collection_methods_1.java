package collection_methods;

import java.util.ArrayList;

public class Collection_methods_1 {
//7.public boolean retainAll(Collection c):-
	public static void main(String[] args) {
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
		al2.add("xxx");
		al2.add("yyy");
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);
		System.out.println(al1.retainAll(al2));//-->returns false,as there are no values to remove the same values are present in both arrayLists
		
//8.public int size():-
		System.out.println("size of al2 :-"+al2.size());
		
//9.public Object[] toArray():-
		Object[] elements=al2.toArray();
		for(Object obj:elements) {
			System.out.println(obj);
		}
//10.public boolean isEmpty(Collection c):-
		System.out.println(al2.isEmpty());//false
		
//11.public void clear(Collection c):-
		al2.clear();
		System.out.println(al2.isEmpty());//true

	}
}
