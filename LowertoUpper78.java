import java.util.*;
class LowertoUpper78
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sb="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				sb=sb+Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch))
			{
				sb=sb+Character.toLowerCase(ch);
			}
			else
			{
				sb=sb+ch;
			}
		}
		System.out.println(sb);
	}
}