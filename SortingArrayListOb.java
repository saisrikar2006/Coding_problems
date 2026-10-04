import java.util.*;
class SortingArrayListOb
{   public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of records..");
    int n=sc.nextInt();
    ArrayList<Student> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        int roll=sc.nextInt();
        String name=sc.next();
        String branch=sc.next();
        double cgpa=sc.nextDouble();
        list.add(new Student (roll,name,branch,cgpa));
    }
    while(true)
    {
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        System.out.println("1. Roll No");
        System.out.println("2. Name");
        System.out.println("3. Branch");
        System.out.println("4. CGPA");
        switch (ch) {
            case 1:
                
                 Collections.sort(list, new SortByRollNo());
                for (Student s:list)
                 {
                  System.out.println(s.rollno+" "+s.Sname+" "+s.Sbranch+" "+s.cgpa);
                 }
                break; 
            case 2:
                Collections.sort(list, new SortBySname());
                for (Student s : list)
                 {
                  System.out.println(s.rollno+" "+s.Sname+" "+s.Sbranch+" "+s.cgpa);
                 }
                break;

            case 3:
                Collections.sort(list, new SortByBname());
                for (Student s : list)
                 {
                  System.out.println(s.rollno+" "+s.Sname+" "+s.Sbranch+" "+s.cgpa);
                 }
                break;

            case 4:
                Collections.sort(list, new SortByCgpa());
                for (Student s : list)
                 {
                  System.out.println(s.rollno+" "+s.Sname+" "+s.Sbranch+" "+s.cgpa);
                 }
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Choice");
                
        }
    }
    }
}
class Student
{
    int rollno;
    String Sname,Sbranch;
    double cgpa;
    public Student(int rno,String name,String br,double cgpa1)
    {
        rollno=rno;
        Sname=name;
        Sbranch=br;
        cgpa=cgpa1;
    }
}
class SortByRollNo implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.rollno==s2.rollno)
        {
            return 0;
        }
        else if(s1.rollno<s2.rollno)
        return 1;
        else
        return -1;
    }
}
class SortBySname implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.Sname.compareTo(s2.Sname)==0)
        return 0;
        else if(s1.Sname.compareTo(s2.Sname)<0)
        return 1;
        else
        return -1;
    }
}
class SortByBname implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.Sbranch.compareTo(s2.Sbranch)==0)
        return 0;
        else if(s1.Sbranch.compareTo(s2.Sbranch)<0)
        return 1;
        else
        return -1;
    }
}
class SortByCgpa implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.cgpa==s2.cgpa)
        {
            return 0;
        }
        else if(s1.cgpa<s2.cgpa)
        return 1;
        else
        return -1;
    }
}