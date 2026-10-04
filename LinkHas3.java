import java.util.*;
class LinkHas3
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<>();
		for(int i=0;i<n;i++)
		{
			if(lh.containsKey(a[i]))
			lh.put(a[i],lh.get(a[i])+1);
			else	
			lh.put(a[i],1);
		}
		Set<String> s=lh.keySet();
		for(String i:s)
		{
			System.out.println(i+"\t"+lh.get(i));
		}
	}
}
