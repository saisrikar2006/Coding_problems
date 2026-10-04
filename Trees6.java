import java.util.*;
class Trees6
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<Integer,Integer> tm=new TreeMap<>(Collections.reverseOrder());
		int arr[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(tm.containsKey(arr[i]))
			tm.put(arr[i],tm.get(arr[i])+1);
			else
			tm.put(arr[i],1);
		}
		Set<Integer> s=tm.keySet();
		System.out.println("-----");
		for(int i : s)
		{
			if(tm.get(i)>=k)
			{
				System.out.println(i);
			}	
		}
	}
}

		