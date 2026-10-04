import java.util.*;
class UpperLower
{
	static String st;
	void upper()
	{
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isLowerCase(ch)||Character.isUpperCase(ch))
			{
				boolean k=Character.isUpperCase(ch);
				if(k)
				System.out.print(ch);
				else
				{
					char m=Character.toUpperCase(ch);
					System.out.print(m);
				}
			}
		}
	}
	void lower()
	{
		System.out.println("\n");

		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isLowerCase(ch)||Character.isUpperCase(ch))
			{
				boolean k=Character.isLowerCase(ch);
				if(k)
				System.out.print(ch);
				else
				{
					char m=Character.toLowerCase(ch);
					System.out.print(m);
				}
			}
		}
	}
	void mixed()
	{
		System.out.println("\n");

		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isLowerCase(ch)||Character.isUpperCase(ch))
			{
				if(i%2==0)
				{
					boolean k=Character.isLowerCase(ch);
					if(k)
					System.out.print(ch);
					else
					{
						char m=Character.toLowerCase(ch);
						System.out.print(m);
					}
				}
				else
				{
					boolean k=Character.isUpperCase(ch);
					if(k)
					System.out.print(ch);
					else
					{
						char m=Character.toUpperCase(ch);
						System.out.print(m);
					}

				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		st=sc.next();
		UpperLower ul= new UpperLower();
		ul.upper();
		ul.lower();
		ul.mixed();
	}
}
	