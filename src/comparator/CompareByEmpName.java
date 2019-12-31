package comparator;

import java.util.Comparator;

public class CompareByEmpName implements Comparator<B>{

	@Override
	public int compare(B arg0, B arg1) {
		return arg0.empName.compareTo(arg1.empName);
	}

}
