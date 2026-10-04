import java.util.*;
import java.lang.*;
class TwoPointer4
{
	public static int targetPairs(int a[],int n)
	{
		int i=0,j=0;		
		while(i<n-2)
		{
			while(a[i]==a[i+1])
			{
				i++;
			}
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			j++;
		}
		return j;
	}
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res=targetPairs(ar,n);
		for(int i=0;i<res;i++)
		{
			System.out.print(ar[i]+" ");
		}
		//System.out.println("OUTPUT:"+res);
	}
}