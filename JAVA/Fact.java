class Fact
{
	static double factorial(double n)
	{
		if(n==1 || n==0)
		{
			return(1);
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
public static void main(String[] args) 
{
	double a=Double.parseDouble(args[0]);
	double f=Fact.factorial(a);
	System.out.println("The factorial of "+ a + " is "+ f );	
}
}