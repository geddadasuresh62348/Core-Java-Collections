package collections_List;

import java.util.ArrayList;

class Employee{
	Integer eId;
	String eName;
	public Employee(Integer eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
}
class Student{
	Integer sId;
	String sName;
	public Student(Integer sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
}
public class ArrayList_of_Objects {

	public static void main(String[] args) {
		ArrayList arrObj=new ArrayList<>();
		arrObj.add(new Employee(11,"ravi"));
		arrObj.add(new Student(12,"kanthara"));
		arrObj.add(null);
		
		for(Object a:arrObj) {
			if(a instanceof Employee)
			{
				Employee e= (Employee)a;
				System.out.println(e.eId+" "+e.eName);
			}
			else if(a instanceof Student) {
				Student s=(Student)a;
				System.out.println(s.sId+" "+s.sName);
			}
			else
			System.out.println(a);
		}
		
		Student ss=(Student)arrObj.get(0);
		System.out.println(ss.sId+" "+ss.sName);
	}

}
