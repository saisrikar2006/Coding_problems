class MtbMTaicls
{
	public static void main(String... args)
	{
		new Thread(){
			public void run()
			{
				System.out.println("task one");
			}
		}.start();
		Thread t1= new Thread(){
			public void run()
			{
				System.out.println("task two");
			}
		};
		t1.start();
	}
}
