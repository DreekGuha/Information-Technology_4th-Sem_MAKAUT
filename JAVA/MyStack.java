import java.util.*;
class MyStack
{
	int a[],top,n;
	MyStack(int n)
	{
		this.n=n;
		a=new int[n];
		top=-1;
	}
	void push()
	{
		if(isFull())
		System.out.println(" The stack is full");
			else
				{
					System.out.println("Enter the element:");
					Scanner S=new Scanner(System.in);
					int b=S.nextInt();
					top++;
					a[top]=b;
				}
	}
	void Pop()
	{
		if(isEmpty())
			System.out.println("The stack is Empty");
		else
		{
			System.out.println("Removed Item "+ a[top]);
			top--;
		}
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	boolean isfull()
	{
		if(top==n-1)
			return true;
		else
			return false;
	}
	void displayStack()
	{
		if(isEmpty())
			System.out.println("the stack is empty");
		else
		{
			System.out.println("The stack is :");
			{
				for(int i=top;i>=0;i--)
					System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of stack ");
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		MyStack obj=new MyStack();
		While(true);
		{
			System.out.println("\n Enter your choice \n 1.Push \n 2.Pop \n 3.Display \n 0.Exit\n");
			int c=S.nextInt();
			Switch(c);
			{
				case 1: obj.push();
					break;
				case 2: obj.Pop();
					break;
				case 3: obj.displayStack();
					break;
			}
		}	
	}
}