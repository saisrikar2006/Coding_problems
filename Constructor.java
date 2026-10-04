class ConstructorDemo
{
	int i;
 	ConstructorDemo()
	{
		i++;
	}
	Public static void main(String...args)
	{
		ConstructorDemo c1= new ConstructorDemo();
		ConstructorDemo c2= new ConstructorDemo();
		System.out.println("no of objects created is: " + i );	
	}
}
