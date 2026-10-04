import java.util.*;
class ArraySortUsingLambda
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
                
                 Arrays.sort(arr, (s1,s2)->s1.rollno-s2.rollno);
                display(arr);
                break; 
            case 2:
                Arrays.sort(arr, (s1,s2)->s1.Sname.compareTo(s2.Sname));
                display(arr);
                break;

            case 3:
                Arrays.sort(arr,(s1,s2)->s1.Sbranch.compareTo(s2.Sbranch));
                display(arr);
                break;

            case 4:
                Arrays.sort(arr, (s1,s2)->Double.compare(s1.cgpa,s2.cgpa));
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