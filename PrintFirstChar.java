import java.util.*;
class PrintFirstChar
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split(" ");
		String sb=" ";
		for(String si:sa)
		{
			char sl=si.charAt(0);
			sb=sb+Character.toUpperCase(sl);
		}
		System.out.println(sb);
	}
}