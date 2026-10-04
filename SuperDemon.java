import java.util.*;
class Inspector
{
	String name;
	int id;
	float salary;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  inspector id");
		 id =sc.nextInt();
		System.out.println("enter  inspector name");
		name = sc.next();
		System.out.println("enter  inspector salary");
		salary = sc.nextFloat();
	}
	void display()
	{
		System.out.println("\n  id:"+id+"\n  name:"+name+"\n  salary:"+salary);
	}

}

class  Commisioner extends Inspector
{
	void display()
	{
		
		System.out.println("CBI");
		super.display();
	}
}
class SuperDemon
{
	public static void main(String args[])
	{
		Commisioner c1=new Commisioner();
		c1.read();
		c1.display();
		Inspector i1= new Inspector();
		i1.read();
		i1.display();	
	}
}
