class Marks  //example of multiple catch block for uncheck exception (Day 9)
{
	public static void main(String[] args) 
	{
		int marks[]={30,40,45,34,11};
		int a=Integer.parseInt(args[0]);
		try
		{
			System.out.println("\t"+marks[2]/a);
			System.out.println("\t"+marks[50]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array overflow exception occured");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured");
		}
		System.out.println("Marks list");
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
	}
}