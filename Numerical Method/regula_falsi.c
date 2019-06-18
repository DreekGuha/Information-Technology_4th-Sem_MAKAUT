#include<stdio.h>
#include<math.h>
float F(float x)
{
	return((x*x)-5*x-7);
}
main()
{
	float a,b,c;
	printf("\n enter the values of a & b\n");
	scanf("%f%f",&a,&b);
	if (F(a)*F(b)<0)
	{
		do
		{
			c=(a*F(b)-b*F(a))/(F(b)-F(b));
			if (F(a)*F(c)<0)
			{
				b=c;
			}
			else 
				a=c;
		}while(fabs(F(c))>0.00001);
		printf("\n the root of function is %0.f\n",c);
	}else
	printf("root not found");
}
