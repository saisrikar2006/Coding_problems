import java.util.*;
class ContainVowel
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split(" ");
		for(String x:sa)
		{
			boolean flag=true; 
			if(x.toLowerCase().matches(".*[aeiou].*"))
			{
				flag=false;	
			}
			if(flag)
			System.out.println(x);
		}
	}
}