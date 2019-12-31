package equall;

public class Employee {
	Integer empId;
	
	@Override
	public int hashCode() {
		return empId*12;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.empId.equals(emp.empId);
	}

}
