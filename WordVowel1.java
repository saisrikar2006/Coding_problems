import java.util.*;
class WordContainVowel
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split("#");
		StringBuffer sb=new StringBuffer();
		for(String si:sa)
		{
			String sl=si.toLowerCase();
			if(!(sl.contains("a")||sl.contains("e")||sl.contains("i")||sl.contains("o")||sl.contains("u")))
			{
				sb.append(si).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}