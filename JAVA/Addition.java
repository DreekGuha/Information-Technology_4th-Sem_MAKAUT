class Addition//example of method overloading  
{
	int a=5;
	int b=10;
	void add()
	{
		System.out.println(a+b);
	}
	void add(double num1,double num2)
	{
		System.out.println(num1+num2);
	}
	void add(int n1,int n2, int n3)
	{
		System.out.println(n1+n2+n3);
	}
	void add(String s1, String s2)
	{
		System.out.print(s1+s2);
	}
	public static void main(String[] args) 
	{
		Addition a=new Addition();
		a.add(2.5,3.5);
		a.add(1,4,3);
		a.add("Hello"," Dreek");

	}
}