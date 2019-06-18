class Stud // example of final method (Day 8)
{
	final void show()
	{
		System.out.println("this is a final method");
	}
}
class Book extends Stud
{
	void show()
	{
		System.out.println("This is a override method");
	}
}
class FinalDemo
{
	public static void main(String[] args) 
	{
		Stud obj=new Book();
		obj.show();	
	}
}