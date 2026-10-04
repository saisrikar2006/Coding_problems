import java.util.*;
class BubbleSortn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10],size,i,sea,low=0;
		System.out.print("enter no.of elements in array");
		size=sc.nextInt();
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
			for(int k=i+1;k<size;k++)
				if(a[i]>a[k])
				{
					int t=a[i];
					a[i]=a[k];
					a[k]=t;
				}
		for(i=0;i<size;i++)
			System.out.print(a[i]+"\t");
	}
}
