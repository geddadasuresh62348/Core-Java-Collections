package maps;

import java.util.ArrayList;

public class Cloning {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("null");
		ar1.add("null2");
		ArrayList<String> ar2=(ArrayList<String>) ar1.clone();
		ar2.add("null3");
		ar1.add("null2.5");
		System.out.println(ar1);
		System.out.println(ar2);
	}
}

