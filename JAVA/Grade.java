class Grade
{
	public static void main(String[] args)
	{
		int TestScore= Integer.parseInt(args[0]);
		if(TestScore>=0 && TestScore<35)
		{
			System.out.println(" C Grade ");
		}
		else if(TestScore>=35 && TestScore<60)
		{
			System.out.println(" B Grade ");
		}
		else if(TestScore>=60 && TestScore<=100)
		{
			System.out.println(" A Grade ");
		}
		else
		{
			System.out.println(" Invalid Input ");
		}
	}
}