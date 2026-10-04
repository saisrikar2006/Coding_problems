import java.util.*;
abstract class Shape
{
	abstract void draw();
	abstract void area();
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	void draw()
	{
		System.out.println("Drawing a circle");
	}
	void area()
	{
		System.out.println("area of  circle is"+(3.14*r*r));
	}
}
class Square extends Shape
{
	int s;
	Square(int s)
	{
		this.s=s;
	}
	void draw()
	{
		System.out.println("Drawing a square");
	}
	void area()
	{
		System.out.println("area of  square is"+(s*s));
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius:");
		Shape s1=new Circle(sc.nextInt());
		s1.draw();
		s1.area();
		System.out.println("enter side:");
		Square s2=new Square(sc.nextInt());
		s2.draw();
		s2.area();
	}
}
