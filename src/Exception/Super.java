package Exception;

public class Super {

	public Super() {
		// TODO Auto-generated constructor stub
	}
	
	public ReturnSuper method1() throws A{
		return null;
	}
	
	public ReturnSuper method2() throws A{
		return null;
	}
	//overloading -  same or subtype return
	//can throws same or subtype or new compile time exceptions
	public ReturnSub method2(String message) throws C{
		return null;
	}

}
