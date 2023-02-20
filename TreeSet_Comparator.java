package collections_Set;

public class TreeSet_Comparator {

	public static void main(String[] args) {
		java.util.TreeSet<String> tr=new java.util.TreeSet<String>((s1,s2)->-s1.compareTo(s2));
		tr.add("zaheer");
		tr.add("joyal");
		tr.add("abhinav");
		System.out.println(tr);
		
		java.util.TreeSet<Integer> tr1=new java.util.TreeSet<Integer>((s1,s2)->-s1.compareTo(s2));
		tr1.add(23);
		tr1.add(45);
		tr1.add(65);
		System.out.println(tr1);
	}
}
