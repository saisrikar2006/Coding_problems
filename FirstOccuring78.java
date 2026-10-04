import java.util.*;
class FirstOccuring78
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> se=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(se.contains(ch))
			{
				System.out.println("Output:"+ch);
				System.exit(0);
			}
			se.add(ch);	
		}
		System.out.println("Output:");

	}
}

	