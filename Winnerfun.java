class Ha extends Thread
{
	void print()
	{
		for(int i=0;i<5;i++)
		System.out.println("hello");	
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println(i);
			print();
		}
	}
}
class Winnerfun
{
	public static void main(String... args)
	{
		Ha h1=new Ha(),h2= new Ha();
		h1.start();
		h2.start();
	}
}
