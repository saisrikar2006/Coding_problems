import java.util.*;
class StudentDe
{
	String rollno,name,branch;
 	int sem;
	float cgpa;
	char sec;
	static String clg="SVEC";
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
		System.out.println("clg:"+clg);
		
	}
	static void change()
	{
		clg="srivasavi enginering clg";
	}
	public static void main(String args[])
	{
 		StudentDe s1= new StudentDe();
		StudentDe s2= new StudentDe();
		s1.read();
		s2.read();
		s1.change();
		System.out.println("student 1 details");
		s1.display();
		System.out.println("student 2 details");
		s2.display();
	}
}