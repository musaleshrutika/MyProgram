#include<stdio.h>
main()
{
	int n,i,j,s;
	printf("enter n\n");
	scanf("%d",&n);
	j=1;
	for(i=1;i<=n;i++)
	{
		for(s=n-1;s>=j;s--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf("*  ");
		}
		printf("\n");
		
	}
}
