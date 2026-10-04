class ExceptionDemo
{
	static void arex()
	{
		int a=50;
		try
		{
			System.out.println("start of the code");
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			/*System.out.println("rest of the code");*/
		}
		finally
		{
			System.out.println("rest of the code");
		}
		System.out.println("end of the code");
	}
	static void npex()
	{
		String s=null;
		try
		{
			System.out.println("start of the code");
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			
			System.out.println("raise");
		}
		finally
		{
			System.out.println("rest of the code");
		}
		System.out.println("end of the code");
	}
	
	static void nfex()
	{
		try
		{
			System.out.println("start of the code");
			int a=Integer.parseInt("sai");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			/*System.out.println("rest of the code");*/
		}
		finally
		{
			System.out.println("rest of the code");
		}
		System.out.println("end of the code");
	}
	public static void main(String... args)
	{
		ExceptionDemo.nfex();
		ExceptionDemo.npex();
		ExceptionDemo.arex();
	}

}