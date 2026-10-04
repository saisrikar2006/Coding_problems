class Increment
{
	static int count;
	static void increase()
	{
		count++;
	}
	public static void main(String args[])
        {
		Increment s1= new Increment();
		s1.increase();
		Increment s2= new Increment();
		s2.increase();
		System.out.println("no.of objects"+count);
	}
}
