package collections_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversions {

	public static void main(String[] args) {
		
		//conversion of arrays to Collection
		String[] str= {"a","b","c"};
		ArrayList<String> obj=new ArrayList<String>(Arrays.asList(str));
		System.out.println(obj);
		
		//conversion of collection to arrays
		
		String[] st=new String[obj.size()];
		obj.toArray(st);
		System.out.println(st);
		
		// normal version collection to Array
		ArrayList data=new ArrayList<>();
		data.add(1);
		data.add(true);
		data.add("rao");
	
		Object[] o=data.toArray();
		for(Object aa:o)
			System.out.println(aa);
	}
}
