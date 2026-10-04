import java.util.*;
interface Shape
{
	void display();
	void draw(int a,int b);
}
interface Size extends Shape
{
	void area();
}
class Recta implements Size
{
	int a,b;
	public void display()
	{
		System.out.println("drawing a rectangle ");
	}
	public void draw(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("drawing a rectangle  of length"+a+"of breadth"+b);
	}
	public void area()
	{
		System.out.println("area a rectangle  "+a*b);
	}
}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		Size s= new Recta();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		s.display();
		s.draw(l,b);
		s.area();
	}
}
