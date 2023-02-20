package maps;

import java.util.*;

class A{
	
}
public class IdentityHashMap_ {

	public static void main(String[] args) {
		Integer int1=new Integer(10);
		Integer int2=new Integer(10);
		
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
// HashMap uses equals method to check duplicate keys
		hp.put(int1,"aaa");// {10-"aaa"}
		hp.put(int2, "bbb");//{10-"bbb"} int2.equals(int1)--->true
		System.out.println(hp);//{10-"bbb"}
		
		IdentityHashMap<Integer,String> ihm=new IdentityHashMap<Integer,String>();
// IdentityHashMap uses '==' method to check duplicate keys
		ihm.put(int1, "aaa");// int2==int1-->false
		ihm.put(int2, "bbb");
		System.out.println(ihm);
	}

}
