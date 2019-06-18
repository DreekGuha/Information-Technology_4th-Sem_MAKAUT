class Sit// demonstrate the @ annotation (Day 7)
{
	String name;
	int age;
	String college;
	Sit(String name, int age, String college)
	{
		this.name=name;
		this.age=age;
		this.college=college;
	}
	void showDetails()
	{
		System.out.println("Name is :"+ name +"\nAge is : "+ age+ "\nCollege name is : "+ college);
	}
}
class Department extends Sit
{
	int roll_no;
	String dept;
	Department(String name, int age, String college, int roll_no, String dept)
	{
		super(name,age,college);
		this.roll_no=roll_no;
		this.dept=dept;
	}
	@Override
	void showDetails()
	{
		System.out.println("Name is :"+ name +"\nAge is : "+ age+ "\nCollege name is : "+ college+ "\nroll no is : "+roll_no+"\nDepartment is : "+dept);
	}
}
class SitDetails
{
	public static void main(String[] args) 
	{
		Sit obj=new Department("Dreek",20,"Siliguri Institute of Technology",39,"Information Technology");
		obj.showDetails();	
	}
}