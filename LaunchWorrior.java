package package3;
class warrior extends Thread
{
	String res1="weapon-1";
	String res2="weapon-2";
	String res3="weapon-3";
	
	public void run()
	{
		try 
		{
			if(Thread.currentThread().getName().equals("RAMA"))
		     {
				ramaRes();
		   }
			else
			{
				ravanaRes();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	 void ramaRes() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized(res1)
		{
		System.out.println("Rama has"+res1);
		Thread.sleep(4000);
			
		synchronized(res2)
		{
		System.out.println("Rama has"+res2);
		Thread.sleep(4000);
				
		synchronized(res3)
		{
		System.out.println("Rama has"+res3);
		Thread.sleep(4000);
				
		}
		}
		}
	}


	void ravanaRes() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized(res1)
		{
		System.out.println("Ravana has"+res1);
		Thread.sleep(4000);
			
		synchronized(res2)
		{
		System.out.println("Ravana has"+res2);
		Thread.sleep(4000);
				
		synchronized(res3)
		{
		System.out.println("Ravana has"+res3);
		Thread.sleep(4000);
				
		}
		}
		}
	}
	}
public class LaunchWorrior {
	public static void main(String[] args)
	{
		warrior w1=new warrior();
		warrior w2=new warrior();
		
		w1.setName("RAMA");
		w2.setName("RAVANA");
		
		w1.start();
		w2.start();
	}

}
