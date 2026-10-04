import java.util.*;
class Fre2
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		int km=a[0];
		TreeMap<Integer,Integer> lh=new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			if(lh.containsKey(a[i]))
			lh.put(a[i],lh.get(a[i])+1);
			else	
			lh.put(a[i],1);
		}
		for(Map.Entry<Integer,Integer> res:lh.entrySet())
		{
			int s=res.getValue();
			if(s>max)
			{
				max=s;
				km=res.getKey();
			}
		}
		System.out.println("output:"+km);
	}
}
