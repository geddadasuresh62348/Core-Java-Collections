package collections_List;

import java.util.ArrayList;

public class ArrayList_Operations {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add("Nani");
		a.add(56.34);
		a.add(true);
		
		//some basic operations 
		System.out.println(a);
		
		a.add(1,"yuvi");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
		a.clear();
		
		System.out.println(a.isEmpty());
	}

}
