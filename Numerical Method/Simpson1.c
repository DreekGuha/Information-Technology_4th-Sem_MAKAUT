#include<stdio.h>
float F(float);
main()
{
	int i,j,n;
	float h,sum,y0,f,yn,x0,xn;
	printf("\n Enter the no. of intervals\n");
	scanf("%d",&n);
	printf("Enter the initial point \n");
	scanf("%f",&x0);	
	printf("Enter the final point \n");
	scanf("%f",&xn);
	h=(xn-x0)/n;
	y0=F(x0);
	yn=F(xn);
	sum=y0+yn;
	for(i=1;i<n;i++)
	{
		
		if((i%2)==0)
		{
			
			f=2*F(x0+i*h);
		}
		else
		{
			f=4*F(x0+i*h);
		}
		sum=sum+f;
	}
	sum=(h/3)*sum;
	printf("\n The integral value of f(x) is %f\n",sum);
}
float F(float x)
{
	return(1/((x*x)+1));
}  
