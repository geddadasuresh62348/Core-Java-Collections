
package collections_List;

import java.util.ArrayList;

public class ArrayList_addAll_method {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(34);
		al1.add(23);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(12);
		al2.add(90);
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(78);
		al3.add(65);
		
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println(al3);
	}

}
