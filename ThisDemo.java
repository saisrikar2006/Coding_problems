class Sample
{
	int a; float b; String s;Sample s4;
	Sample()
	{
		System.out.println("\nthis demo");
	}
	Sample(int a,float b,String s)
	{
		this();

		this.a=a;
		this.b=b;
		this.s=s;
	}
	void disp()
	{
		System.out.print("\na:"+a+"\nb:"+b+"\ns:"+s);
	}
	Sample get()
	{
		return this;
	}
	Sample instructor(Sample s4)
	{
		return this.s4 =s4;
	}
	
}
class ThisDemo
{
	public static void main(String args[])
	{
		Sample s1= new Sample(12,8.9f,"sai");
		s1.disp();
		Sample s2= new Sample(34,98.6f,"srikar");
		s2.disp();
		Sample s3=s2.get();
		s3.disp();
		Sample s4= s3.instructor(s3);
		s4.disp();
	}
	
}