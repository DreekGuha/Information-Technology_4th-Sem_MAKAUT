#include <stdio.h>
main()
{
	int i,j,k,n;
	float m,s;
	printf("\n enter the number of equations \n");
	scanf("%d",&n);
	float a[n][n+1],x[n];
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n+1;j++)
		{
			printf("\n Enter the coefficent of %d equation\n",i);
			scanf("%f",&a[i][j]);
		}
	}
	for(i=1;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			m=a[j][i]/a[i][i];
			for(k=i;k<=n+1;k++)
			{
				a[j][k]=a[j][k]-m*a[i][k];
			}
		}
	}
	x[n]=a[n][n+1]/a[n][n];
	for(i=n-1;i>=1;i--)
	{
		s=0;
		for(j=i+1;j<=n;j++)
		{
			s=s+a[i][j]*x[j];
		}
		x[i]=(a[i][n+1]-s)/a[i][i];
	}
	printf("\n Roots are :\n");
	for(i=1;i<=n;i++)
	{
		printf("\n x[%d]=%0.f",i,x[i]);
	}
}
