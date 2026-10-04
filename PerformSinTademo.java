class PerformSinTademo extends Thread
{
	PerformSinTademo(String s)
	{
		super(s);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String... args)
	{
		PerformSinTademo t1=new PerformSinTademo("Thread-A");	
		PerformSinTademo t2=new PerformSinTademo("Thread-B");	
		t1.start();
		t2.start();
	}
}
	
