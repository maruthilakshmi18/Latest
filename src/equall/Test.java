package equall;

import java.util.HashMap;
import java.util.Map;

public class Test{
	
	public static void main(String[] args) {
		/*Set<Integer> set  = new HashSet<>();
		System.out.println(set.add(1));
		System.out.println(set.add(1));*/  //returns false coz in set interger internally uses hashmap(hash maip internally follows hash code and equals)
		
		/*Set<Employee> empSet = new HashSet<>();
		
		
		System.out.println(empSet.add(emp));
		System.out.println(empSet.add(emp2));*/  // returns true even emp, emp2 objects are same, empployee set will treat different values. So for employee class v implemnt hashcode and equals to get uniqe values 
		//System.out.println("     ");
		//System.out.println("     ");
		
		
		Map<Employee, String> map = new HashMap<>();
		
		Employee emp = new Employee();
		emp.empId=1;
		Employee emp2 = new Employee();
		emp2.empId=1;
		
		
		
		map.put(emp, "s");
		String emp3 = map.get(emp2);
		System.out.println(emp3);
		
		
		
		
		
		
		
		
		
	}

}
