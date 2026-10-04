import java.util.*;
class SortByRollno implements Comparator<StudentS>
{
	public int compare(StudentS s1,StudentS s2)
	{
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno>s2.rollno)
			return 1;
		else  
			return -1;
	}
}
class SortBySname implements Comparator<StudentS>
{
	public int compare(StudentS s1,StudentS s2)
	{
		if(s1.sname.compareTo(s2.sname)==0)
			return 0;
		else if(s1.sname.compareTo(s2.sname)>0)
			return 1;
		else  
			return -1;
	}
}
class SortByBranch implements Comparator<StudentS>
{
	public int compare(StudentS s1,StudentS s2)
	{
		if(s1.branch.compareTo(s2.branch)==0)
			return 0;
		else if(s1.branch.compareTo(s2.branch)>0)
			return 1;
		else  
			return -1;
	}
}
class SortByCgpa implements Comparator<StudentS>
{
	public int compare(StudentS s1,StudentS s2)
	{
		if(s1.cgpa==s2.cgpa)
			return 0;
		else if(s1.cgpa>s2.cgpa)
			return 1;
		else  
			return -1;
	}
}
class MainStu
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <StudentS> li=new ArrayList<>();
		System.out.println("Enter no.of students:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int r=sc.nextInt();
			sc.nextLine();
			String nam=sc.nextLine();
			String br=sc.nextLine();
			float cg=sc.nextFloat();
			li.add(new StudentS(r,nam,br,cg));
		}
		while(true)
		{
			System.out.println("ENTER YOUR CHOICE:");
			System.out.println("1:Sort by rollno\n2:sort by name");
			System.out.println("3:sort by branch\n4:sort by cgpa");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:Collections.sort(li,new SortByRollno());
					System.out.println(li);break;
				case 2:Collections.sort(li,new SortBySname());
					System.out.println(li);break;
				case 3:Collections.sort(li,new SortByBranch());
					System.out.println(li);break;
				case 4:Collections.sort(li,new SortByCgpa());
					System.out.println(li);break;
				default:System.exit(0);
			}
		}
	}
}