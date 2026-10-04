class ArrayDemo
{
	public static void main(String args[])
	{
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		float f[] = {3.2f,6.4f,9.6f,6};
		for(int i=0;i<f.length;i++)
		System.out.println(f[i]);
		String s[]= new String[10];
		for(int i=0;i<3;i++)
		s[i]=sc.next();
		for(int i=0;i<3;i++)
		System.out.println(s[i]+"length"+s[i].length());
	}
}

