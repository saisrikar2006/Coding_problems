import java.util.*;
class MajorityE3
{
	public static ArrayList<Integer> majority(int a[])
	{
		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);
		}
		int max=(int)Math.floor(a.length/3);
		for(int i:hm.keySet())
		{
			if(hm.get(i)>max)
			{
				li.add(i);
			}
		}
		return li;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> x=MajorityE3.majority(a);
		System.out.println("output:");
		for(int i:x)
		{
			System.out.println(i);
		}
	}
}
