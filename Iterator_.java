package list;
import java.util.*;
public class Iterator_ {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String element=it.next();
			if(element.equals("ccc")) {
				it.remove();
			}
			System.out.println(element);
		}
		System.out.println(al);
	}

}
