import java.util.*;
class Employee
{
	String name;
	int id;
	float salary;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  employee id");
		 id =sc.nextInt();
		System.out.println("enter  employee name");
		name = sc.next();
		System.out.println("enter  employee salary");
		salary = sc.nextFloat();
	}
	void display()
	{
		System.out.println("\nemployee  id:"+id+"\nemployee  name:"+name+"\nemployee  salary:"+salary);
	}

}

class  Programmer extends Employee
{
	void display()
	{
		float bonus=5000.0f;
		System.out.println("\nemployee  id:"+id+"\nemployee  name:"+name+"\nemployee  salary:"+salary+ "\nemployee  bonus:"+bonus);
	}
}
class SingleInheritanceDemo
{
	public static void main(String args[])
	{
	
	Employee e1= new Employee();
		e1.read();
		e1.display();
		Programmer p1=new Programmer();
		p1.read();
		p1.display();
	}
}
