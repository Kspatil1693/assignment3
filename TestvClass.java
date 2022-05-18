package package3;

interface first
{
	default void show()
	{
		System.out.println("Default first");
	}
	}
interface second
{
	default void show()
	{
		System.out.println("Default second");
	}
	}
public class TestvClass implements first,second
{
  public void show()
  {
	  first.super.show();
	  second.super.show();
  }
  public static void main(String args[])
  {
	  TestvClass ob=new TestvClass();
	  ob.show();
  }
}
