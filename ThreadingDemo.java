class Demo1 extends Thread
{
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
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class ThreadingDemo
{
	public static void main(String... args)
	{
		Demo1 d1=new Demo1(),d2= new Demo1();
		d1.setPriority(10);
		d1.setName("ThreadA");
		d2.setName("ThreadB");
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		d1.run();
		d2.run();
	}
}
