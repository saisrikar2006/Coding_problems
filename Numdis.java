import java.util.*;
class Numdis
{
	public static void main(String args[])
	{
		String st;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		st=sc.next();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			boolean f=Character.isDigit(ch);
			if(f)
			{
				char m=st.charAt(i-1);
				for(int k=1;k<=ch-'0';k++)
				System.out.print(m);
			}
		}
	}
}	
