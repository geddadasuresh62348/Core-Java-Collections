package maps;

import java.util.HashMap;
import java.util.WeakHashMap;

class B{
	public String toString() {
		return "a";
	}
}
public class WeakHashMap_ {
// HashMap is not allowing Garbage Collector to destroy its elements
	public static void main(String[] args) {
		B a=new B();
		HashMap<B,String> hm=new HashMap<B,String>();
		hm.put(a, "aaa");
		System.out.println("hm Before GC : "+hm);
		a=null;
		System.gc();
		System.out.println("hm After GC : "+hm);
// WeakHashMap is allowing Garbage Collector to destroy its elements	
		B a1=new B();
		WeakHashMap<B,String> whm=new WeakHashMap<B,String>();
		whm.put(a1, "bbb");
		System.out.println("WHM Before GC : "+whm );
		a1=null;
		System.gc();
		System.out.println("WHM After GC : "+whm );
	}

}
