class ExceptionDemon
{
	public  static void main(String args[])
	{
		int a=50;
		try
		{
			System.out.println("start of the code");
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("rest of the code");
		}
		finally
		{
			System.out.println("rest of the code");
		}
		System.out.println("end of the code");
	}
	
}
