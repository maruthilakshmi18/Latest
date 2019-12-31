package basic;

public class Serializ implements java.io.Serializable {

	 private int RollNum;
	  private int Age;
	  private String Name;
	  private String Address;
	  private int Height;
	 
	  public Serializ(int roll, int age, String name,
	  String address, int height) {
	    this.RollNum = roll;
	    this.Age = age;
	    this.Name = name;
	    this.Address = address;
	    this.Height = height;
	  }
	 
	  public int getRollNum() {
	    return RollNum;
	  }
	  public void setRollNum(int RollNum) {
	    this.RollNum = RollNum;
	  }
	  public int getAge() {
	    return Age;
	  }
	  public void setAge(int Age) {
	    this.Age = Age;
	  }
	  public String getName() {
	    return Name;
	  }
	  public void setName(String Name) {
	    this.Name = Name;
	  }
	  public String getAddress() {
	    return Address;
	  }
	  public void setAddress(String Address) {
	    this.Address = Address;
	  }
	  public int getHeight() {
	    return Height;
	  }
	  public void setHeight(int Height) {
	    this.Height = Height;
	  }
	}

