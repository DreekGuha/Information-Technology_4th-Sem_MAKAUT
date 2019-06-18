class Sort
{
	void ascending(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
		public static void main(String[] args) 
		{
			int arr[]=new int[args.length];
			Sort obj=new Sort();
			for(int i=0;i<args.length;i++)
			{
				arr[i]=(Integer.parseInt(args[i]));
			}	
			obj.ascending(arr);
		}

}