package list;
import java.util.*;
public class Stack_ {

	public static void main(String[] args) {
//1.public void push():-
//--> It can be used to insert the specified element to the stack.
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.add("e");
		System.out.println(s);
		
//2.public Object pop():-
//--> It can be used to remove and return the top of the element.
		System.out.println(s.pop());

//3.public Object peek():-
//--> It can be used to return the top element only,it doesn't remove the top element.
		System.out.println(s.peek());
		System.out.println(s);

//4.public int search(Object element):-
//--> It can be used to get the position of the specified element in Stack,if the specified element is not existed then search() method will return -1
		System.out.println(s.search("a"));//4
		System.out.println(s.search("b"));//3
		System.out.println(s.search("c"));//2
		System.out.println(s.search("d"));//1
		System.out.println(s.search("x"));// returns -1 ,as the element is not present inside the Stack
	}

}
