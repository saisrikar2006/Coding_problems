import java.io.*;
class Dostream
{
	public static void main(String...args) throws IOException
	{
		FileOutputStream fo = new FileOutputStream("abc.txt");
		DataOutputStream do = new DataOutputStream(fo);
		do.writeInt(65);
		do.close();
	}

}
