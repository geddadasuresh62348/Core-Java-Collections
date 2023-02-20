package maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_ {

	public static void main(String[] args) {
		NavigableMap<String,String> nm=new TreeMap<String,String>();
		nm.put("A","AAA");
		nm.put("F","FFF");
		nm.put("B","BBB");
		nm.put("D","DDD");
		nm.put("E","EEE");
		nm.put("C","CCC");
		nm.put("G","GGG");
		System.out.println(nm);
// NavigableMap Methods
//1.public NavigableMap descendingMap()
		System.out.println(nm.descendingMap());
		
//2.public object ceilingKey(object key)
		System.out.println(nm.ceilingKey("D"));// returns lowest object greaterthan or equal to "D"
		
//3.public object higherKey(object key)
		System.out.println(nm.higherKey("D"));// returns lowest object greaterthan  "D"
		
//4.public object floorKey(object key)
		System.out.println(nm.floorKey("D"));//returns highest element lessthan or equal to "D"
		
//5.public object lowerKey(object key)
		System.out.println(nm.lowerKey("D"));//returns highest element lessthan  "D"
		
//6.public NavigableMap pollFirstEntry()
		System.out.println(nm.pollFirstEntry());
		
//7.public NavigableMap pollLastEntry()
		System.out.println(nm.pollLastEntry());
		System.out.println(nm);

		
	}

}
