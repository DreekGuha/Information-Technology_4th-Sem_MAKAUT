class NewThread extends Thread
{
	public void run()
	{
		for(int i=1;i<110;i++)
		{
			int a=i*i;
			if(a<110)
			{
				System.out.println("Suqare of "+i+" is "+a);
				try{Thread.sleep(500);}
				catch(Exception e){}
			}
		}
	}
}
class Square
{
	public static void main(String[] args) 
	{
		NewThread obj=new NewThread();
		obj.start();
		for(int i=1;i<1010;i++)
		{
			int b=i*i*i;
			if(b<1010)
			{
				System.out.println("Cube of "+i+" is "+b);
				try{Thread.sleep(500);}
				catch(Exception e){}
			}
		}
	}
}
