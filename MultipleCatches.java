import java.util.*;
class MultipleCatches
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		try
		{
			int k=n/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}