package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators_ {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("aa");
		ll.add("bb");
		ll.add("cc");
		ll.add("dd");
		ll.add("ee");
		ll.add("ff");
		System.out.println(ll);
		ListIterator<String> lit=ll.listIterator();
		System.out.println("Elements in Forward direction : -");
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex()+"--->"+lit.next());
		}
		System.out.println();
		System.out.println("Elements in Reverse direction : -");
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex()+"--->"+lit.previous());
		}
		System.out.println();
// remove,insert and replace operations:-
		while(lit.hasNext()) {
			String element= lit.next();
			if(element.equals("cc")) {
				lit.remove();
			}
			if(element.equals("dd")) {
				lit.add("xx");
			}
			if(element.equals("ff")) {
				lit.set("zz");
			}
		}
		System.out.println(ll);
		
	}	

}
