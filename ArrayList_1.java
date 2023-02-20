package list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
//constructors of ArrayList
//1. 0-argument constructor:-
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(al);

//2. capacity argument constructor:-
		ArrayList<String> al1=new ArrayList<String>(30);
		System.out.println(al1.size());

//3. Collection argument constructor:-
		ArrayList <String> al2=new ArrayList<String>();
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		ArrayList <String> al3=new ArrayList<String>(al2);
		System.out.println(al3);
// 4.generic type of ArrayList:-
		ArrayList arr=new ArrayList();// It allows all types of data
		arr.add("n");
		arr.add(true);
		arr.add(12);
		arr.add(null);
		arr.add(null);
		System.out.println(arr);
	}

}
