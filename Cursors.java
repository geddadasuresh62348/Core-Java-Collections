package collections_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursors {

	public static void main(String[] args) {
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("ranga");
		obj1.add("shaheen");
		obj1.add("Hafeez");
		
		//read the data using cursor :Iterator
		Iterator<String> itr=obj1.iterator();
		while(itr.hasNext()) {
			System.err.println(itr.next());
		}
		
		// read the data using forEach method : using lambda 
		System.out.println("------forEach method-------");
		obj1.forEach(str->System.out.println(str));
		
		// read the data using forEach method : using method reference 
		System.out.println("------method reference-------");
		obj1.forEach(System.out::println);
		
	}

}
