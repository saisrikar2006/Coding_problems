import java.util.*;
class ArraySortUsingComparatorClasses
{  
     static void display(Student arr[]) {
        System.out.println("\nRollNo\tName\tBranch\tCGPA");
        for (Student s:arr) {
            System.out.println(s.rollno+"\t"+s.Sname+"\t"+s.Sbranch+"\t"+s.cgpa);
        }
    }
     public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of records..");
    int n=sc.nextInt();
    Student[] arr=new Student[n];
    for(int i=0;i<n;i++)
    {
        int roll=sc.nextInt();
        String name=sc.next();
        String branch=sc.next();
        double cgpa=sc.nextDouble();
        arr[i] = new Student(roll, name, branch, cgpa);  
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
                
                 Arrays.sort(arr, new SortByRollNo());
                display(arr);
                break; 
            case 2:
                Arrays.sort(arr, new SortBySname());
                display(arr);
                break;

            case 3:
                Arrays.sort(arr, new SortByBname());
                display(arr);
                break;

            case 4:
                Arrays.sort(arr, new SortByCgpa());
                display(arr);
                break;
            default:
                System.out.println("Exiting...");
                return;                
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
        else if(s1.rollno>s2.rollno)
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
        else if(s1.Sname.compareTo(s2.Sname)>0)
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
        else if(s1.Sbranch.compareTo(s2.Sbranch)>0)
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
        else if(s1.cgpa>s2.cgpa)
        return 1;
        else
        return -1;
    }
}