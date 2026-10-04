import java.util.*;
import java.io.*;
class Studentdata 
{
	String branch,name,rollno;
	int grade;
	char sec;
	float cgpa;
	void readdet() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("enter student name");
		name=br.readLine();
		System.out.print("enter student rollno");
		rollno=br.readLine();
		System.out.print("enter student branch");
		branch=br.readLine();
		System.out.print("enter student grade");
		grade=br.read();
		br.readLine();
		System.out.print("enter student section");
		sec=br.readLine().charAt(0);
		System.out.print("enter student cgpa");
		cgpa=Float.parseFloat(br.readLine());
	}
	void display()
	{
		System.out.println("student details\nname:"+name+"\nrollno:"+rollno+"\nbranch:"+branch+"\nsection:"+sec+"\ncgpa:"+cgpa+"\ngrade:"+(char)grade);
	}
}


class ArrayObjects
{
	public static void main(String...args) throws IOException
	{
		int i,n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value:");
		n=Integer.parseInt(br.readLine());
		Studentdata[] datas=new Studentdata[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter student"+(i+1)+"details");
			datas[i]=new Studentdata();
				datas[i].readdet();
		}
		for(i=0;i<n;i++)
		{
			datas[i].display();
		}
	}
}