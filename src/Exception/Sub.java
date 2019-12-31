package Exception;

public class Sub extends Super{

	public Sub() {
		// TODO Auto-generated constructor stub
	}
	//throws same or subclass of the exception
	//doesnot check for the RuntimeException
	//subclass method should not throw compile time exception if the super class method is not throwing any compiletime exception
	
	//return type - it can return same type or subtype of the superclass method return type
	@Override
	public ReturnSub method1() throws B{
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public ReturnSub method2() throws E{
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
