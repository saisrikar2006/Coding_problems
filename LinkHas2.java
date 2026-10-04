import java.util.*;
class LinkHas2
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
		LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
		for(int i=0;i<n;i++)
		{
			if(lh.containsKey(a[i]))
			lh.put(a[i],lh.get(a[i])+1);
			else	
			lh.put(a[i],1);
		}
		Set<Integer> s=lh.keySet();
		for(int i:s)
		{
			System.out.println(i+"\t"+lh.get(i));
		}
	}
}
