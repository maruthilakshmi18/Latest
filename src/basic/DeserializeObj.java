package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Serializ s=null;
		
		try {
			
		
		FileInputStream fis=new FileInputStream("D://Student.ser");
		ObjectInputStream oos=new ObjectInputStream(fis);
	     s=(Serializ)oos.readObject();
	     oos.close();
	     fis.close();
	  
	}
		
		catch(IOException ioe)
		{
			  ioe.printStackTrace();
		       return;
		}
		
	
	catch(ClassNotFoundException cnfe)
    {
      System.out.println("Student Class is not found.");
      cnfe.printStackTrace();
      return;
    }
		
		   System.out.println("roll no is:" +s.getRollNum()+ " name is:" + s.getName() +" height is:" + s.getHeight()+ " age is :" +s.getAge() + " address is:" +s.getAddress());
				
		
}
}
