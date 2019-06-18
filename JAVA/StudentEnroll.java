class StudentEnroll//example of static block
{
	String dept,name;
	String ID;
	static String Orgname;
	static int count;
	StudentEnroll(String ID, String name, String dept)
	{
		this.ID=ID;
		this.name=name;
		this.dept=dept;
		count++;
	}
	static
		{
			count=0;
			Orgname="SIT";
		}
		{

		}
		{

		}
		void showData()
		{
			System.out.println(" "+ ID + " " + name + " " + dept);
		}
		static void showOrgData()
		{
			System.out.println("Organisation data :");
			System.out.println("Name : " + Orgname);
			System.out.println("Total : " + count);
		}
		public static void main(String[] args) 
		{
			StudentEnroll s1=new StudentEnroll("IT01","Dreek","IT");
			StudentEnroll s2=new StudentEnroll("CS01","Rahul","CSE");
			s1.showData();
			s2.showData();
			StudentEnroll.showOrgData();	
		}
}