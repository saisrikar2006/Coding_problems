import java.util.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class UserDefineExDemo
{
	static void validate(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("not eligible to vote");
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}