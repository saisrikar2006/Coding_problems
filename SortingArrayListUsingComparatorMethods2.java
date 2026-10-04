import java.util.*;
class SortingArrayListUsingComparatorMethods2
{  
    static void display(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s.rollno + " " + s.Sname + " " + s.Sbranch + " " + s.cgpa);
        }
    }
     public static void main(String arg[])
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
        System.out.println("1. Roll No");
        System.out.println("2. Name");
        System.out.println("3. Branch");
        System.out.println("4. CGPA");
        System.out.println("Enter choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                
                 Collections.sort(list,Comparator.comparingInt( (Student s)->s.rollno).reversed());
                display(list);
                break; 
            case 2:
                Collections.sort(list,Comparator.comparing((Student s)->s.Sname).reversed());
                 display(list);
                break;

            case 3:
                Collections.sort(list,Comparator.comparing((Student s)->s.Sbranch).reversed());
                display(list);
                break;

            case 4:
                Collections.sort(list,Comparator.comparingDouble((Student s)->s.cgpa).reversed());
                display(list);
                break;
           default:
                System.out.println("Exitting..");
		System.exit(0);

                
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