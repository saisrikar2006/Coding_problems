import java.util.*;
class StringPalindrome
{	
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=0;
		int r=s.length()-1;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				System.out.println("Not a Palindrome");
				System.exit(0);
			}
			l++;
			r--;
		}
		System.out.println("It is a Palindrome");
	}
}
