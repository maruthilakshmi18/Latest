package basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObj {

	public static void main(String[] args) {
		
		{
		    Serializ obj = new Serializ(101, 25, "Lakshmi", "ooty", 6);
		    try{ 
		      FileOutputStream fos = new FileOutputStream("D://Student.ser"); 
		      ObjectOutputStream oos = new ObjectOutputStream(fos);
		      oos.writeObject(obj);
		      oos.close();
		      fos.close();
		      System.out.println("Serialzation Done!!");
		   }catch(IOException ioe){
		      System.out.println(ioe);
		    }
		  }
		}
	}


