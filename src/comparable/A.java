package comparable;

public class A implements Comparable<A>{
	Integer empId;

	@Override
	public int compareTo(A i) {
		/*if(i !=null && i instanceof A) {
//			System.out.println(i.empId);
			if(this.empId==i.empId) {
				return 0;
			}else if(this.empId>i.empId) {
				return 1;
			}else {
				return -1;
			}
		} */
		
	System.out.println("value "+this.empId.compareTo(i.empId));
		
		return this.empId.compareTo(i.empId);
		
	}
	
	

	

}
