package collections_List;

import java.util.ArrayList;

public class ArrayList_Constructor_3 {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		ArrayList all=new ArrayList<>(al);
		all.add(30);
		System.out.println(all);
		System.out.println(al);
	}
}
