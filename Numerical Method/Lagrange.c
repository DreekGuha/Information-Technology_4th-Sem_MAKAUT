#include<stdio.h>
main()
{
	int i,j,n;
	float m,sum=0;
	printf("\n Enter the numner of poles \n");
	scanf("%d",&n);
	float x[n],y[n],x1;
	for(i=0;i<n;i++)
	{
		printf("\n Enter the values of x%d\n",i);
		scanf("%f",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("\n Enter the values of f(%d)\n",i);
		scanf("%f",&y[i]);
	}
	printf("\n Enter the interpolating point\n");
	scanf("%f",&x1);
	for(i=0;i<n;i++)
	{
		m=1;
		for(j=0;j<n;j++)
		{
			if(i!=j)
			{
				m=m*((x1-x[j])/(x[i]-x[j]));
			}
		}
		sum=sum+m*y[i];
	}
	printf("\n The interpolating value of f(%f) is %f\n",x1,sum);
}
