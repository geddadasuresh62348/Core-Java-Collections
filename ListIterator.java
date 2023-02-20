package collections_List;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("e");
		java.util.ListIterator<String> lstr=al.listIterator();
		lstr.add("j");
		while(lstr.hasNext()) {
			String str=lstr.next();
			if(str.equals("a"))
				lstr.remove();
			if(str.equals("b")) {
				lstr.set("c");
			}
		}
		while(lstr.hasPrevious()) {
			System.out.println(lstr.previous());
		}
		System.out.println(al);
	}

}
