#include<stdio.h>
float F(float x)
{
	return(1/((x*x)+1));
}
main()
{
	int i;
	float n,h,sum,y0,yn,x0,xn;
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
	for(i=1;i<n;i+=6)
	{
		sum=sum+5*F(x0+i*h)+F(x0+(i+1)*h)+6*F(x0+(i+2)*h)+F(x0+(i+3)*h)+5*F(x0+(i+4)*h);
		if(i<6)
			sum=sum+2*F(x0+(i-1)*h);
	}
	sum=((3*h)/10)*sum;
	printf("\n The integral value of f(x) is %f\n",sum);
}

