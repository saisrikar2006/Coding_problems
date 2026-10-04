class JaggedDemo
{
	public static void main(String... ards)
	{
		int a[][]= new int[4][];
		a[0] = new int[] {1,2,3,4};
		a[1] = new int[2];
		a[2] = new int[3];
		a[3] = new  int[4];
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+"array length is"+a[i].length);
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}