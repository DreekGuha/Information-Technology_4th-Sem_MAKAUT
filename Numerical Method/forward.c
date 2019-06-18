#include<stdio.h>
main()
{
	int i,j,n;
	float sum,x1,p=1,h,s;
	printf("Enter the no of poles : \n");
	scanf("%d",&n);
	float x[n], y[n];
	float z[n][n];
	for(i=0;i<n;i++)
	{
		printf("\n Enter the values of x%d :\n ",i);
		scanf("%f",&x[i]);
	}
		for(i=0;i<n;i++)
		{
				printf("\n Enter the values of f(%d) :\n",i);
				scanf("%f",&y[i]);
		}
		for(i=0;i<n;i++)
		{
			z[0][i]=y[i];
		}
		for(i=1;i<n;i++)
		{
			for(j=0;j<(n-i);j++)
			{
				z[i][j]=z[i-1][j+1]-z[i-1][j];
			}
		}
		printf("\n The difference table is :\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-i);j++)
			{
				printf("%f	",z[i][j]);
			}
			printf("\n");
		}
		printf("\n Enter the interpolating point \n");
		{
			scanf("%f",&x1);
		}
		h=x[1]-x[0];
		s=(x1-x[0])/h;
		sum=z[0][0];
		for(i=1;i<n;i++)
		{
			p=(p*(s-i+1))/i;
			sum=sum+p*z[i][0];
		}
		printf("\n The Interpolating value of f(%f)=%f",x1,sum);
}
