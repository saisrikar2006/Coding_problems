import java.util.*;
class Sprial
{
	public static void main(String... args)
	{
		int a[][]=new int[10][10],size,i=0,j=0,k=0,f,count=0;
		System.out.println("enter size of matrix");
		Scanner sc =new Scanner(System.in);
		size=sc.nextInt();
		for(f=0;f<size;f++)
		for(j=0;j<size;j++)
		{
			System.out.print("enter a"+j+f+"element\n");
			a[j][f]=sc.nextInt();
		}
		f=0;
		int n=size;
		while(count!=(size*size))
		{
			for(i=k;i<n;i++)
			{
				System.out.println(a[k][i]+"\t");
				count++;
			}
			for(i=k+1;i<n;i++)
			{
				System.out.println(a[i][n-1]+"\t");
				count++;
			}
			for(j=n-2;j>=f;j--)
			{
				System.out.println(a[n-1][j]+"\t");
				count++;
			}
			for(j=n-2;j>f;j--)
			{
				System.out.println(a[j][f]+"\t");
				count++;
			}
			k++;
			n--;
		}
	}
}
