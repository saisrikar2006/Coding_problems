import java.util.*;
class MajorityE1
{
	public static int majority(int a[])
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);
		}
		int max=a.length/2;
		for(int i:hm.keySet())
		{
			if(hm.get(i)>max)
			return i;
		}
		return -1;
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
		int x=MajorityE1.majority(a);
		System.out.println("output:"+x);
	}
}
