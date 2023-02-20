package set;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int eNo;
	String eName;
	float eSal;
	String eAddr;
	public Employee(int eNo,String eName,float eSal,String eAddr) {
		this.eNo=eNo;
		this.eName=eName;
		this.eSal=eSal;
		this.eAddr=eAddr;
	}
	public int (Employee emp) {
		int val=
	}
}
public class UserDefinedElements_Sorting {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"aaa",5000,"hyd");
		Employee emp2=new Employee(2,"bbb",6000,"xyz");
		Employee emp3=new Employee(3,"ccc",3000,"abc");
		Employee emp4=new Employee(4,"ddd",4000,"def");
		Employee emp5=new Employee(5,"eee",8000,"klm");
		Employee emp6=new Employee(6,"fff",2000,"hyd");
		
		TreeSet<Employee> ts=new TreeSet<Employee>();
		ts.add(emp5);
		ts.add(emp1);
		ts.add(emp3);
		ts.add(emp2);
		ts.add(emp6);
		ts.add(emp4);
		System.out.println(ts);
	}

}
