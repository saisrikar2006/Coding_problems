import java.util.*;
class FirstNonRepeated
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		LinkedHashMap<Character,Integer> tm=new LinkedHashMap<>();
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
			if(tm.get(ch)==1)
			{	
				System.out.println("Output:"+ch);
				System.exit(0);

			}
		}
		System.out.println("output: $");
	}
}

	