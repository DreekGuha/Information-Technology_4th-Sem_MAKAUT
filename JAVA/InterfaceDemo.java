interface Animal //Example of Interface (Day 8)
{
	String type1="Mammals";
	String type2="Reptiles";
	void talk();
	void see();
	void move();
}
class Human implements Animal
{
	public void talk()
	{
		System.out.println("I am a Human, I belong to "+ Animal.type1 +" family");
	}
	public void see()
	{
		System.out.println("I can see all colour");
	}
	public void move()
	{
		System.out.println("I move by walk");
	}
}
class Snake implements Animal
{
	public void talk()
	{
		System.out.println("I am a Snake, I belong to "+ Animal.type2 +" family");
	}
	public void see()
	{
		System.out.println("I can see only black and white");
	}
	public void move()
	{
		System.out.println("I move by scrowling");
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		Animal h=new Human();
		h.talk();
		h.see();
		h.move();
		Animal s=new Snake();
		s.talk();
		s.see();
		s.move();
	}
}