class Table 
{
	void printTable(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
		}
	}
}
class Simple1 extends Thread
{
	Table t;
	Simple1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class Simple2 extends Thread
{
	Table t;
	Simple2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
class SyncDemo
{
	public static void main(String... args)
	{
		Table t1=new Table();
		Simple1 s1= new Simple1(t1);
		Simple2 s2= new Simple2(t1);
		s1.start();
		s2.start();
	}
}