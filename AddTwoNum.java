import java.util.Scanner;
class AddTwoNum
{
	int a,b,sum;
	void readvalues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
	}
	void sum()
	{
sum=a+b;
	System.out.println("sum of two numbers is"+sum);
	}
public static void main(String args[])
{
		AddTwoNum a= new AddTwoNum();
	a.readvalues();
	a.sum();
	}
}
