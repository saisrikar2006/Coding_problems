class Demo extends Thread
{
	String print()
	{
		for(int i=0;i<5;i++)
		System.out.println("hello");
		return Thread.currentThread().getName();	
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
			String s=print();
			System.out.println(s+"winner");
		}
	}
}
class MultiThreadingDemo
{
	public static void main(String... args)
	{
		Demo d1=new Demo(),d2= new Demo();
		d1.start();
		d2.start();
	}
}
