package comparator;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<B>{

	@Override
	public int compare(B o1, B o2) {
		return o1.empId.compareTo(o2.empId);
	}

}
