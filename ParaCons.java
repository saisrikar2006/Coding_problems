import java.util.*;
class ParaCons
{
	ParaCons()
	{
		System.out.println("hello world "  );	
	}
	ParaCons(String s)
	{
		System.out.println("welcome to java Mr/Mis " + s );	
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name"  );	
		String s=sc.next();
		ParaCons p1=new ParaCons();
		ParaCons p=new ParaCons(s);
	}
}
