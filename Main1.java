class Main1
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(float a,float b)
	{
		return a+b;
	}
	public static void main(String...args)
	{
		Main1 m1=new Main1();
		System.out.println(Main1.add(5,5.0f));
	}
}
