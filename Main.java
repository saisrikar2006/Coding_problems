import java.util.*;
class Main
{
	public static char getGrade(int total)
	{
		if(total>=540)
		return 'A';
		else if(total>=480)
		return 'B';
		else if(total>=420)
		return 'C';
		else if(total>=360)
		return 'D';
		else if(total>=300)
		return 'E';
		else
		return 'F';
	}
		
	public static void main(String...args)
	{
		HashMap<String,ArrayList<Integer>> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String sn=sc.next();
			hm.put(sn,new ArrayList<Integer>());
			for(int j=0;j<6;j++)	
			{
				int m=sc.nextInt();
				hm.get(sn).add(m);
			}
		}
		Set<String> s=hm.keySet();
		int max=0;
		String s1="";
		for(String x:s)
		{
			ArrayList<Integer> res=hm.get(x);
			int total=0,avg=0;
			for(int j=0;j<6;j++)
			{
				total+=res.get(j);
			}
			res.add(total);
			res.add(total/6);
			res.add((int)getGrade(total));
			if(max<total)
			{
				max=total;
				s1=x;
			}
		}
		for(String x:s)
		{
			System.out.print(x+" : ");
			ArrayList<Integer> res=hm.get(x);
			for(int j=0;j<8;j++)
			{
				System.out.print(res.get(j)+"   ");
			}
			int y=res.get(8);
			System.out.print((char)y);
			System.out.println();
		}
		System.out.println("Maxmium marks:");
		System.out.print(s1+" : ");
		ArrayList<Integer> res=hm.get(s1);
		for(int j=0;j<8;j++)
		{
			System.out.print(res.get(j)+"   ");
		}
		int y=res.get(8);
		System.out.print((char)y);
	}
}


	