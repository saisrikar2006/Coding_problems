import java.util.*;
class Employee 
{
   	String designation;
	int id;
	float salary;
	Employee()
	{
		designation="employee";
	}		
 	void read()
 	{
		Scanner sc= new Scanner(System.in);
	        System.out.println("enter employee id");
		id=sc.nextInt();
		System.out.println("enter employee salary");
		salary=sc.nextFloat();
    	}

    	void display() 
	{
        	System.out.print("\nEmployee id:"+id+"\nsalary:"+salary+"\ndesignation:"+designation);
    	}
}

class AManager extends Employee 
{
	String s;
	void display()
	{
		System.out.print("\nEmployee id:"+id+"\nsalary:"+salary);
		System.out.print("\ndesignation:ASSIANT MANAGER");
		System.out.println("\nIncrement for every 2 years 10% of salary");
	}

}
class Manager extends AManager 
{
   	void display()
	{
		System.out.print("\nEmployee id:"+id+"\nsalary:"+salary);
		System.out.print("\ndesignation:GENERAL MANAGER");
		System.out.println("\nIncrement for every 2 years 10% of salary with extra 5% bonus ands health insurance");
	}
}
class MultiLevelInheritenceDemo
{
    	public static void main(String...args) 
	{
        	Employee e1= new Manager();
		e1.read();
		e1.display();
        	Employee e2=new AManager();
		e2.read();
		e2.display();
	}
}
