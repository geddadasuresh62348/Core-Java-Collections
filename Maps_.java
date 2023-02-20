package maps;
import java.util.*;
public class Maps_ {

	public static void main(String[] args) {
// Map Methods:-
//1.public void put(Object key,Object value):-
//-->used to add elements to map interface It returns null after adding key-value pair and if we try to add value to existing key it 
//   replaces the existing value and returns that value
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		System.out.println(map.put(4, "ddd"));// returns null
		System.out.println(map.put(5, "eee"));// returns nulll
		System.out.println(map.put(5, "eee"));// returns 'eee' 
		System.out.println(map);
		
//2.public void putAll(map);-
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.putAll(map);
		System.out.println(map1);
		
//3.public Object remove(Object key):-
		System.out.println(map.remove(1));
		System.out.println(map);
		
//4.public Object get(Object key):-
		System.out.println(map.get(3));
		
//5.public int size(map):-
		System.out.println(map.size());
	
//6.public boolean isEmpty(map):-
		System.out.println(map.isEmpty());
		
//7.public void clear(map):-
//		map.clear();
		System.out.println(map.isEmpty());
		
//8.public boolean containskey(Object key):-
		System.out.println(map.containsKey(3));

//9.public boolean containsValue(Object value):-
		System.out.println(map.containsValue("ddd"));

//10.public set keyset(map):-
		System.out.println(map.keySet());
		
//11.public set values():-
		System.out.println(map.values());
		
		System.out.println("==============");
		System.out.println(map.put(2, "yyy"));	// It will replace the existing value
		System.out.println(map.put(1, "ccc"));
		System.out.println(map.put(6, "eee"));
		
		System.out.println(map.put(null, "hhh"));
		System.out.println(map.put(null, "ggg"));// only one null key is possible 
		System.out.println(map.put(8, null));
		System.out.println(map.put(9, null));
		System.out.println(map.put(10, null));// any no of null values are possible
		System.out.println(map);
	}

}
