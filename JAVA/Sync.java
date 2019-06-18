class Callme // example of Synchronization (Day 10)
{
	synchronized void call(String msg)
	{
		System.out.println("["+msg);
		try{Thread.sleep(500);}
		catch(Exception e){}
		System.out.println("]");
	}
}
class Caller extends Thread
{
	String msg;
	Callme target;
	Caller(Callme t, String s)
	{
		target=t;
		msg=s;
		start();
	}
	public void run()
	{
		target.call(msg);
	}
}
class Sync
{
	public static void main(String[] args) 
	{
		Callme target=new Callme();
		Caller t1=new Caller(target,"Hello");
		Caller t2=new Caller(target,"World");
	}
}