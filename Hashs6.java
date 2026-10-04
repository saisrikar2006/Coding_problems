import java.util.*;
class Hashs6
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]=new int[n];
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
		if(s.size()==n)
		System.out.println(true);
		else
		System.out.println(false);
	}
}

		