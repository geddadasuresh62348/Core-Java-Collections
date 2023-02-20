package maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String> hm=new java.util.HashMap<Integer,String>();
		hm.put(1, "harsh");
		hm.put(2, "sai");
		hm.put(3, "sri");
		
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		
		Collection<String> values=hm.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> entries=hm.entrySet();
		
		Iterator<Entry<Integer,String>> itr=entries.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String> e=itr.next();
			
			Integer k= e.getKey();
			System.out.println(k);
			
			String v=e.getValue();
			System.out.println(v);
		}	
	}
}
