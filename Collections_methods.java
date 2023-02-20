package collections_List;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_methods {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>(Collections.nCopies(10, "mahesh"));
		System.out.println(a);
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("avanthika");
		arr.add("amarnath");
		arr.add("bhaskar");
		
		Collections.swap(arr, 1, 0);
		System.out.println(arr);
	}
}
