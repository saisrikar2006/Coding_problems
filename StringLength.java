class StringLength
{

	public static void main(String... args)
	{
		String s1[]={"aacd","eegh","pqrs"};
		for(String i:s1)
		{
			for(int m=0;m<i.length();m++)
			{
				System.out.print((char)(i.charAt(m)+1));
			}
			System.out.println();
			for(int m=0;m<i.length();m++)
			{
				System.out.print((char)(i.charAt(m)-1));

			}
			System.out.println();	
		}		
	}
}
