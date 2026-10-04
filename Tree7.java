import java.util.*;
class Tree7
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		TreeMap<String,Float> tm=new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			String na=sc.nextLine();
			float cgp=sc.nextFloat();
			sc.nextLine();
			tm.put(na,cgp);
		}
		for(Map.Entry<String,Float> res:tm.entrySet())
		{
			String s=res.getKey();
			if((s.charAt(0)=='v'||s.charAt(0)=='V')&&(s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='O'))
			{
				System.out.println(res.getValue());
			}
		}
	}
}

