class X implements Runnable//example of runnable interface (Day 10)
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
			
		}
	}
}
class Even
{
	public static void main(String[] args) 
	{
		X obj=new X();
		Thread T=new Thread(obj);
		T.start();	
	}
}