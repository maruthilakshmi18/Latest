package comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableProg {
	public static void main(String[] args) {
		A a = new A();
		a.empId=1;
		
		A a1 = new A();
		a1.empId=4;
		
		A a2 = new A();
		a2.empId=3;
		
		List<A> aList = new ArrayList<>();
		aList.add(a2);
		aList.add(a);
		aList.add(a1);
		
		Collections.sort(aList);
		
		
		aList.stream().forEach(i->System.out.println(i.empId));
		
		/*List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(1);
		intList.add(3);
		Collections.sort(intList);  //internally implements comaparable interface(appicable for int string long float all data type)
		for(int k :  intList) {
			System.out.println(k);
		}
		intList.stream().forEach(i->System.out.println(i));*/
		
		System.out.println(a1.equals(a2));
		
	
	
	}

}
