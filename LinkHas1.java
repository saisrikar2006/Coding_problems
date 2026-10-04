import java.util.*;
class LinkHas1
{
	public static void main(String...args)
	{
		LinkedHashMap<String,String> lh=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of departments:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String dept=sc.next();
			String na=sc.next();
			lh.put(dept,na);
		}
		Set<String> s=lh.keySet();
		System.out.println("Department\tHOD name");
		for(String k:s)
		{
			System.out.println(k+"\t"+lh.get(k));
		}
	}
}

