import java.util.*;
class ReversingVowels
{
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		return false;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char sa[]=s.toCharArray();
		int l=0,r=s.length()-1;
		while(l<r)
		{
			while(l<r&&!isVowel(sa[l]))
			{
				l++;
			}
			while(l<r&&!isVowel(sa[r]))
			{
				r--;
			}
			if(l<r)
			{
				char ch=sa[r];
				sa[r]=sa[l];
				sa[l]=ch;
			}
			l++;
			r--;
		}
		System.out.println(new String(sa));
	}
}