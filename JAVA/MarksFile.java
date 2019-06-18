import java.io.FileReader; // expamle of final block and checked exception (Day 9)
class MarksFile
{
	public static void main(String[] args) {
		FileReader fr=null;
		try
		{
			fr=new FileReader("/name/Marks");
		}
		catch (Exception e)
		{
			//Todo Auto generate catch block
			e.printStackTrace();

		}
		finally{
			System.out.println("Inside Final Block");
			try
			{
				fr.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();

			}
		}
	}
}