package package3;

class myException1 extends Exception
{
	public myException1(String s)
	{
		super(s);
	}
	}
public class MyException
{
	public static void main(String[] args)
	{
		try
		{
			throw new myException1("temp");
		}
		catch(myException1 ex)
		{
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
		
	}

}
