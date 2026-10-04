import java.util.*;
class WordVowel1
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sa[]=s.split("#");
		StringBuffer sb=new StringBuffer();
		for(String si:sa)
		{
			if(!si.matches(".*[aeiou].*"))
			{
				sb.append(si+" ");
			}
		}
		System.out.println(sb.toString());
	}
}