package collections_Set;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet<Integer> hs=new java.util.HashSet<Integer>();
		hs.add(11);
		hs.add(22);
		hs.add(34);
		hs.add(47);
		hs.add(59);
		hs.add(63);
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			Integer str=itr.next();
			System.out.println(str);
		}
	}

}
