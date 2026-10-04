import java.util.*;
class ContainVowel1
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split(" ");
		for(String x:sa)
		{
			boolean flag=true; 
			for(int i=0;i<x.length();i++)
			{
				if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
				{
					flag=false;	
				}
			}
			if(flag)
			System.out.println(x);
		}
	}
}
