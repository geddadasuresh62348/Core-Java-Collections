package collections_Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_subSet {

	public static void main(String[] args) {
		TreeSet<Integer> tr=new TreeSet<Integer>();
		for(int i=0;i<20;i++) {
			tr.add(i+1);
		}
		System.out.println(tr);
		
		SortedSet<Integer> st=tr.subSet(3, 15);
		System.out.println(st);
		TreeSet<Integer> st1=new TreeSet<Integer>(st);
		SortedSet<Integer> st2=st1.subSet(3,13);
		System.out.println(st2);
		SortedSet<Integer> st3=st1.tailSet(13);
		SortedSet<Integer> st4=st1.headSet(5);
		
		System.out.println(st3);
		System.out.println(st4);

	}
}
