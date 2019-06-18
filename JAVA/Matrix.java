import java.io.*;
//import java.util.*;
class Matrix
{
	void addMatrix(int m1[][],int m2[][], int res[][], int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
	void displayMatrix(int res[][],int row, int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("\t"+res[i][j]);
			}
			System.out.println();
		}	

	}
	public static void main(String[] args) 
	{
		int row,col,i,j;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		//Scanner s=new Scanner(System.in);
		System.out.println("Enter row number....: ");
		row=Integer.parseInt(br.readLine());
		//=s.nextInt();
		System.out.println("Enter column number....: ");
		col=Integer.parseInt(br.readLine());
		//col=s.nextInt();		
		int m1[][]=new int[row][col];
		int m2[][]=new int[row][col];
		int res[][]=new int[row][col];
		System.out.println("\n\n Enter 1st matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter m1["+i+"]["+j+"]th element....:");
				m1[i][j]=Integer.parseInt(br.readLine());
				//m1[i][j]=s.nextInt();
			}
		}
		System.out.println("\n\n Enter 2nd matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("Enter m2["+i+"]["+j+"]th element....:");
				m2[i][j]=Integer.parseInt(br.readLine());
				//m2[i][j]=s.nextInt();
			}
		}
		Matrix obj =new Matrix();
		System.out.println("1st matrix....:");
		obj.displayMatrix(m1,row,col);
		System.out.println("2nd matrix...:");
		obj.displayMatrix(m2,row,col);
		obj.addMatrix(m1,m2,res,row,col);
		System.out.println("Resultant matrix..:");
		obj.displayMatrix(res,row,col);

	}
}