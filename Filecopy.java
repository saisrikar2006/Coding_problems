import java.io.*;
class Filecopy
{
	public static void main(String...args) throws IOException
	{
		FileReader fr = new FileReader("ArrayObjects.java");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw = new FileWriter("output.java");
		BufferedWriter bw=new BufferedWriter(fw);
		int i;
		while((i=br.read())!=-1)
		{
			//System.out.print((char)i);//
			bw.write(i);
		}
		System.out.println("successfully copied");
	}
}

		