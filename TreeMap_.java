package maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_ {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("F","FFF");
		tm.put("A","AAA");
		tm.put("B","BBB");
		tm.put("D","DDD");
		tm.put("E","EEE");
		tm.put("C","CCC");
		tm.put("G","GGG");
		System.out.println(tm);
	}

}
