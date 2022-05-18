package package3;
import java.security.Permission;
import java.util.Scanner;
class ageException extends Exception
{ 
	public String tostring()
	{
		return "Give the License";
	}
	  class customer1
	 	{
		 int age;
	   public void collectionData1()
	  {
		  System.out.println("Enter the age of person is");
		  Scanner sc=new Scanner(System.in);
		   age= sc.nextInt();
		  
	  }
	 	
	  void verify1() throws ageException
	  {
		  
		  if(age<=18)
		  {
			  System.out.println(" UnderAgeException"+age);
		  }
		  else if(age>=60)
		  {
			  System.out.println("OverAgeException"+age);
		  }
		  else
		  {
			  ageException ae=new ageException();
			  System.out.println(ae.tostring());
			   throw ae;
		  }
	  }
	 		
	}
	}
class Office
{
	void customer1Check() throws ageException,invalidException
	{
		customer c1=new customer();
		c1.collectionData1();
		try
		{
			c1.collectionData1();
		c1.verify1();
		}
		catch(ageException e)
		{
			System.out.println(e.tostring());
		}
	}
}
public class AgeException {
	public static void main(String[] args) throws  ageException
	
	{
		Office of1=new Office();
		of1.customer1Check();
	}

}










