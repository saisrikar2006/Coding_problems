class First implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try{
			Thread.sleep(1000);}
			catch(Exception e){}
			System.out.println("Good Morning");
		}
	}
}
class Second implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try{
			Thread.sleep(2000);}
			catch(Exception e){}
			System.out.println("Hello");
		}
	}
}
class Third implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try{
			Thread.sleep(3000);}
			catch(Exception e){}
			System.out.println("Welcome");
		}
	}
}
class MainDemRun
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new First());
		Thread t2=new Thread(new Second());
		Thread t3=new Thread(new Third());
		t1.start();
		t2.start();
		t3.start();
	}
}

