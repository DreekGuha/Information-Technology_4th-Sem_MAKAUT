import java.util.*;
class SOD
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number :  ");
		int a=s.nextInt();
		int sum=0;
		while(a>0)
		{
			sum=sum+(a%10);
			a=a/10;
		}
		System.out.println("The sum of the digits of the given number is : " + sum);
	}
}