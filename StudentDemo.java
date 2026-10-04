class StudentDemo
{
	public static void main(String args[])
	{
 		Student s1= new Student();
		Student s2= new Student();
		s1.read();
		s2.read();
		System.out.println("student 1 details");
		s1.display();
		System.out.println("student 2 details");
		s2.display();
	}
}