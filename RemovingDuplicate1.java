import java.util.*;
class RemovingDuplicate1
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> se=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(se.contains(ch))
			{
				se.remove(ch);
			}
			else
			{
				se.add(ch);
			}	
		}
		System.out.println("Output:");
		for(char ch:se)
		{
			System.out.print(ch);
		}
	}
}

	