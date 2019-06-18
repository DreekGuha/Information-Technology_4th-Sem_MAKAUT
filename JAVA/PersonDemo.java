abstract class Person// Example of abstract class (Day 7)
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void showbasicDetails()
	{
		System.out.println("Name :" + name);
		System.out.println("Age :"+ age);
	}
	abstract void showDetails();
}
class Employee extends Person
{
	String empid;
	int salary;
	Employee(String name,int age, String empid, int salary)
	{
		super(name,age);
		this.empid=empid;
		this.salary=salary;
	}
	void showDetails()
	{
		System.out.println("Empid : " + empid);
		System.out.println("Salary : "+ salary );
	}
}
class Student extends Person
{
	int regd_no;
	char grade;
	Student(String name,int age, int regd_no,char grade)
	{
		super(name,age);
		this.regd_no=regd_no;
		this.grade=grade;
	}
	void showDetails()
	{
		System.out.println("Student regd no : "+ regd_no);
		System.out.println("Student grade :" + grade);
	}
}
class PersonDemo
{
	public static void main(String[] args) 
	{
		Person p1=new Employee("Dreek",20,"E 209", 1000000);
		p1.showbasicDetails();
		p1.showDetails();
		Person p2=new Student("Bikash",19,48, 'A');
		p2.showbasicDetails();
		p2.showDetails();		
	}
}