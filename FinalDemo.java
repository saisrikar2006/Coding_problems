class DemoF
{
	final int v=5;
	void hello(int v)
	{
		this.v=v;
		System.out.println("hello world");
	}
}
class FinalDemo extends DemoF
{
	
	void hello()
	{
		System.out.println("hello java");
	}
	public static void main(String...args)
	{
		DemoF d=new DemoF();
		d.hello(6);
	}
}