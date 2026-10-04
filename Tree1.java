import java.util.*;
class Tree1
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
			System.out.println(res.getKey()+"\t"+res.getValue());
		}
	}
}

