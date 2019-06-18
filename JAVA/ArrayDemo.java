import java.util.Arrays;
class ArrayDemo
{
	public static void main(String[] args) 
	{
		int marks[]={2,7,5,4,8,10,20,15};
		int markscopy[];
		int markscopyrange[];
		markscopy=Arrays.copyOf(marks,5);
		String mstr1=Arrays.toString(markscopy);
		System.out.println(mstr1);
		markscopyrange=Arrays.copyOfRange(marks,1,5);
		Arrays.sort(markscopyrange);
		String mstr2=Arrays.toString(markscopyrange);
		System.out.println(mstr2);
		System.out.println("Is markscopy equal markscopyrange?"  + Arrays.equals(markscopy,markscopyrange));	
	}
}