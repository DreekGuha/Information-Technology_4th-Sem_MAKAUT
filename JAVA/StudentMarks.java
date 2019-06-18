class InvalidMarksException extends Exception//example of custom exception (user defined exception) (Day 9)
{
	InvalidMarksException(String str)
	{
		super(str);
	}
}
class StudentMarks
{
	int marks;
	StudentMarks(int marks)
	{
		this.marks=marks;
	}
	void Validate() throws InvalidMarksException
	{
		if(marks<0||marks>100)
		{
			throw new InvalidMarksException(marks+" is not validate");
		}
		else
		{
			System.out.println("Entry is ok");
		}
	}
	public static void main(String[] args) 
	{
		StudentMarks m1=new StudentMarks(Integer.parseInt(args[0]));
		try
		{
			m1.Validate();
		}	
		catch(InvalidMarksException e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}
}