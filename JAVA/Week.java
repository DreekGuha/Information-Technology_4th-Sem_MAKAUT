class Week
{
	public static void main(String args[])
	{
		int day=Integer.parseInt(args[0]);
		String dname=" ";
		switch(day)
		{
			case 0: dname="Sunday";
			break;
			case 1: dname="Monday";
			break;
			case 2: dname="Tuesday";
			break;
			case 3: dname="Wednesday";
			break;
			case 4: dname="Thursday";
			break;
			case 5: dname="Friday";
			break;
			case 6: dname="Saturday";
			break;
			default: System.out.println("Invalid Input");
		}
		System.out.println(dname);
	}
}
			
			