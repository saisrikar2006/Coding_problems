import java.util.*;
class Hashs7
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i]))
			hm.put(arr[i],hm.get(arr[i])+1);
			else
			hm.put(arr[i],1);
		}
		Set<Integer> s=hm.keySet();
		System.out.println("-----");
		for(int i : s)
		{
			if(hm.get(i)==k)
			{
				System.out.println(arr[i]);
			}	
		}
	}
}

		