class First extends Thread
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
class Second extends Thread
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
class Third extends Thread
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
class MainDem
{
	public static void main(String args[])
	{
		First t1=new First();
		Second t2=new Second();
		Third t3=new Third();
		t1.start();
		t2.start();
		t3.start();
	}
}
