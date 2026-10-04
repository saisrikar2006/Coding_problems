class ReThrowingDemo
{
	static void test1() throws Exception
	{
		System.out.println("test 1");
		throw new Exception("likeuh");
	}
	static void test2() throws Exception
	{
		try
		{		
			test1();
		}
		catch(Exception e)
		{
			System.out.println("test 2");
			throw e;
		}
	}
	public static void main(String... args)
	{
		try
		{		
			test2();
		}
		catch(Exception e)
		{
			System.out.println("main");
			e.printStackTrace();
		}
			}
}
