package package3;

public class Thread1 extends Thread
{
  
	public void run()
	{
		System.out.println("New thread is starting:");
	}
	public static void main(String[] args)
	{
		Thread1 t=new Thread1();
		t.start();
		
	}
}

