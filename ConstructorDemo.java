import java.util.*;
class ConstructorDemo
{
	static int i;
 	ConstructorDemo()
	{
		i++;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of objr=ects to create:");	
		int n=sc.nextInt();
		ConstructorDemo[] cons= new ConstructorDemo[n];
		for(int j=0;j<n;j++)
			cons[i]=new ConstructorDemo();
		System.out.println("no of times constructor called:" + i );	
	}
}
