package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorProg {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.empId=1;
		b1.empName="A";
		
		B b2 = new B();
		b2.empId=4;
		b2.empName="b";
		
		B b3 = new B();
		b3.empId=3;
		b3.empName="c";
		
		List<B> list = new ArrayList<>();
		list.add(b3);
		list.add(b1);
		list.add(b2);
		ComparatorImpl compImpl = new ComparatorImpl();
		//sort by empId
		Collections.sort(list, compImpl);
		list.stream().forEach(i->System.out.println(i.empId));
		CompareByEmpName compare = new CompareByEmpName();
		//sort by empName
		Collections.sort(list,compare.reversed());
		list.stream().forEach(i->System.out.println(i.empName));
	}

}
