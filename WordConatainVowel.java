import java.util.*;
class WordConatainVowel
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split("#");
		String sb=" ";
		for(String si:sa)
		{
			String sl=si.toLowerCase();
			if(!(sl.contains("a")||sl.contains("e")||sl.contains("i")||sl.contains("o")||sl.contains("u")))
			{
				sb=sb+" "+si;
			}
		}
		System.out.println(sb);
	}
}