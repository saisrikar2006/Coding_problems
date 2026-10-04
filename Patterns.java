class Patterns
{
	static int prime(int n)
	{
		int k=0;
		for(int i=2;i<=n/2;i++)
		if(n%i==0)
			k++;
		if(k==0)
			return n;
		else
			return 0;
	}
	public static void main(String... ards)
	{
		int a[][]= new int[4][];
		a[0] = new int[1];
		a[1] = new int[2];
		a[2] = new int[3];
		a[3] = new  int[4];
		int count=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				boolean k=IsPrime(count);
				if(k==count)
				{
					System.out.print(count+"\t");
				}
				else
					j--;
				count++;

			}
			System.out.println();
		}
	}
}