package list;
import java.util.*;
public class List_methods {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
// 1.public void add(int index,Object element):-
		al.add("a");
		al.add("b");
		al.add(2,"c");
		al.add(3,"d");
		al.add(4,"e");
		System.out.println(al);
		al.add(4, "null");
		System.out.println(al);
		
//2.public void addAll(int index,Collection c):-
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("f");
		al1.add("g");
		al.addAll(3, al1);
		System.out.println(al);
		
//3.public Object set(int index,Object value):-
		System.out.println(al);
		System.out.println(al.set(2, "aaa"));
		System.out.println(al);
		
//4.public Object get(int index):-
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println(al.get(al.size()-1));
//		System.out.println(al.get(al.size()));//-->Error,IndexOutOfBoundsException
//5.public Object remove(int index):-
		System.out.println(al.remove(2));
		System.out.println(al);
//		System.out.println(al.remove(19));//-->Error,IndexOutOfBoundsException

//6.public int indexOf(object value):-
		System.out.println(al.indexOf("a"));
		System.out.println(al.lastIndexOf("e"));
		System.out.println(al.indexOf("ty"));// returns -1 ,because element is not present inside the collection
	}
}
