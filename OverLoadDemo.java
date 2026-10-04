class MethodOver
{
	int add(int a,int b) 
	{
		return a+b;
	}
	int add(int a,int b,int c) 
	{
		return a+b+c;
	}
	float add(float a,float b)	
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
	}
}
class OverLoadDemo
{
	public static void main(String args[])
	{
		MethodOver o = new MethodOver();
		System.out.println("addition is "+o.add(15,25));
		System.out.println("addition is "+o.add(1,2,3));
		System.out.println("addition is "+o.add(10.57f,20.43f));
		System.out.println("addition is "+o.add(10.57f,23));

	}
}	

