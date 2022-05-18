package package3;
import java.util.Scanner;
class invalidException extends Exception
{
	public String tostring()
	{
		return "Invalid Customer";
	}
	}
class customer
{
	int accno=111;
	int pin=234;
	int accno1;
	int pin1;
	
	void collectData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accno");
		accno1=sc.nextInt();
		System.out.println("Enter the pwd");
		pin1=sc.nextInt();
	}
	void verify() throws invalidException
	{
		if(accno==accno1 && pin==pin1)
		{
			System.out.println("Valid Customer");
		}
		else
		{
			invalidException ice=new invalidException();
			System.out.println(ice.tostring());
			throw ice;
		}
		
	}
	public void collectionData1() {
		// TODO Auto-generated method stub
		
	}
	
	}
class Bank
{ void customerCheck()
	{
	customer c1=new customer();
	c1.collectData();
	try
	{
		c1.verify();
	}
	catch(invalidException e)
	{
		System.out.println(e.tostring());
	}
	}
	}
public class InvalidCustomerException
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		Bank b=new Bank();
		b.customerCheck();
	}
	

}
























