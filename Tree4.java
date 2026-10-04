import java.util.*;
class Tree4
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
			if(s.charAt(0)=='p'||s.charAt(0)=='P')
			{
				System.out.println(res.getValue());
			}
		}
	}
}

