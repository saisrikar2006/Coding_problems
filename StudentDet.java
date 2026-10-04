import java.util.*;
class StudentD
{
	String rollno,name,branch;
 	int sem;
	float cgpa;
	char sec;
	void read()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter roll no");
		rollno=sc.next();
		System.out.println("enter branch");
		branch=sc.next();
		System.out.println("enter section");
		sec=sc.next().charAt(0);
		System.out.println("enter sem");
		sem=sc.nextInt();
		System.out.println("enter cgpa");
		cgpa=sc.nextFloat();
	}
	void display()
	{
		 System.out.println("name:"+name);
     		 System.out.println("regd number:"+rollno);
      		System.out.println("sem:"+sem);
      		System.out.println("branch:"+branch);
      		System.out.println("section:"+sec);
      		System.out.println("cgpa:"+cgpa);
		
	}
}
class StudentDet
{
	public static void main(String args[])
	{
 		StudentD s1= new StudentD();
		StudentD s2= new StudentD();
		s1.read();
		s2.read();
		System.out.println("student 1 details");
		s1.display();
		System.out.println("student 2 details");
		s2.display();
	}
}