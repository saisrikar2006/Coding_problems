package pack2;
import pack1.*;
public class Access
{
	public static void main(String...args)
	{	
		A a1= new A();
		a1.dispa();
		System.out.println("main :"+a1.a);
		B b1 = new B();
		b1.dispb();
	}
}
