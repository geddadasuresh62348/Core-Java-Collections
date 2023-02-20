package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ {

	public static void main(String[] args) {
//1.public LinkedList():-used to create an empty LinkedList Object
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		System.out.println(ll);
//2.public LinkedList(Collection c):-
		LinkedList<String>ll1=new LinkedList<String>(ll);
		System.out.println(ll1);
// Methods:-
//1. public addFirst():-
		System.out.println();
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.addFirst("a");
//2.public addLast():-
		ll2.addLast("b");
		ll2.add("c");
		ll2.add("d");
		System.out.println(ll2);
//3.public getFirst():-
		System.out.println(ll2.getFirst());
//4.public getLast():-
		System.out.println(ll2.getLast());
//5.public removeFirst():-
		System.out.println(ll2.removeFirst());
//6.public removeLast():-
		System.out.println(ll2.removeLast());
		System.out.println(ll2);
	}

}
