class Student2 //example of chaining constructor
{
	int roll_number;
	String name;
	void studentDetails()
	{
		System.out.println(roll_number);
		System.out.println(name);
	}
	Student2()
	{
		this(39);
	}
	Student2(int the_roll_number)
	{
		this(39,"Dreek");
	}
	Student2(int the_roll_number, String name)
	{
		roll_number=the_roll_number;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student2 obj1=new Student2();
		obj1.studentDetails();	
	}
}