package package3;

public class trycatch {
public static void main(String[] args) 
{
	int a[]=new int [3];
	try {
	a[7]=3;
	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
 System.out.println("Array index is out of bound");
	}
	finally
	{
		System.out.println("The array is of size"+a.length);
		}
	}
}

