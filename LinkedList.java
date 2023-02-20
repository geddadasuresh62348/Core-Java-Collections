package collections_List;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.addLast(3);
		l.addFirst(0);
		System.out.println("original content : "+l);
		l.removeFirst();
		l.removeLast();
		System.out.println("after deletion first & last : "+l);
		l.remove(1);
		l.set(0, 10);
		System.out.println(l);
		l.clear();
		System.out.println(l);
	}
}
