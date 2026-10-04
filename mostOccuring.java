import java.util.*;
class MostOccuring
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		TreeMap<Character,Integer> tm=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			tm.put(ch,tm.getOrDefault(ch,0)+1);	
		}
		Set<Character> se=tm.keySet();
		int max=0;
		char c=' ';
		for(char ch:se)
		{
			if(tm.get(ch)>max)
			{	
				max=tm.get(ch);
				c=ch;
			}
		}
		System.out.println("output:"+c);
	}
}

	