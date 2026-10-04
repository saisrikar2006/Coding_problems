import java.util.*;
class BinarySearcha
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10],size,i,sea,low=0,high;
		System.out.print("enter no.of elements in array");
		size=sc.nextInt();
		high=size;
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		System.out.println("enter searching element");
			sea=sc.nextInt();
		for(i=0;i<size;i++)
		{
			int k=(low+high)/2;
			if(a[k]==sea)
			{
				System.out.println("searching element is found at "+(k+1));
				break;
			}
			else if(a[k]<sea)
			{
				low=k+1;
			}
			else
			{

				high=k-1;
			}
		}
		if(low>high)
		System.out.println("searching element is not found");

	}
}