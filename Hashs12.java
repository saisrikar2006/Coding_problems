import java.util.*;
class Hashs12
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
		int arr[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(lhm.containsKey(arr[i]))
			lhm.put(arr[i],lhm.get(arr[i])+1);
			else
			lhm.put(arr[i],1);
		}
		Set<Integer> s=lhm.keySet();
		System.out.println("-----");
		for(int i : s)
		{
			if(lhm.get(i)<=k)
			{
				System.out.println(i);
			}	
		}
	}
}

		