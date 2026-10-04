import java.util.*;
class QuadraticRoots
{
	public static void main(String...args)
	{
		int a,b,c;
		float d;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a,b,c values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(b*b)-(4*a*c);
		if(d==0)
		{
			System.out.println("real and equal roots");	
			System.out.println("therefore,root1="+(-b+Math.sqrt(d))/(2*a)+"\troot2="+(-b-Math.sqrt(d))/(2*a));

		}
		else if(d>0)
		{
			System.out.println("real and distinct roots");	
			System.out.println("therefore,root1="+(-b+Math.sqrt(d))/(2*a)+"\troot2="+(-b-Math.sqrt(d))/(2*a));
		}
		else
		{
			System.out.println("real and imaginary roots");	
			float coef=(-b/(2*a));
			float nex=(-d);
			System.out.println("therefore,root1="+coef+"+i*"+(Math.sqrt(nex)/(2*a))+"\troot2="+coef+"-i*"+(Math.sqrt(nex)/(2*a)));
		}
	}
}



