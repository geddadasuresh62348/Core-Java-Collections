package maps;

import java.util.SortedMap;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> tm=new java.util.TreeMap<Integer,String>();
		tm.put(11, "bsc");
		tm.put(22, "ba");
		tm.put(33,"bcom");
		
		System.out.println(tm);
		
		// to sort the elements in descending order 
		
		java.util.TreeMap<Integer, String> tm1=new java.util.TreeMap<Integer,String>((i1,i2)->i2.compareTo(i1));
		tm1.put(18, "mca");
		tm1.put(24, "mba");
		tm1.put(14,"msc");
		System.out.println(tm1);
		
		// putAll method
		tm1.putAll(tm);
		System.out.println(tm1);
		
		// adding one map into another map
		SortedMap<Integer, String> ss=tm1.subMap(14,24);
		java.util.TreeMap<Integer, String> tm2=new java.util.TreeMap<Integer,String>(ss);
		
		System.out.println(tm2);	
	}
}
