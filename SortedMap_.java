package maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_ {

	public static void main(String[] args) {

		SortedMap<String,String> sm=new TreeMap<String,String>();
		sm.put("A", "AAA");
		sm.put("E", "EEE");
		sm.put("D", "DDD");
		sm.put("C", "CCC");
		sm.put("B", "BBB");
		System.out.println(sm);
//SortedMap Methods
//1.public object firstKey()
//2.public object lastKey()
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		
//3.public SortedMap headMap(object key)
		System.out.println(sm.headMap("D"));
		
//4.public SortedMap tailMap(object key)
		System.out.println(sm.tailMap("D"));
		
//5.public SortedMap subMap(object fromkey,object tokey)
		System.out.println(sm.subMap("A", "D"));
		
	}

}
