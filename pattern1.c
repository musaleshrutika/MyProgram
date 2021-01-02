#include<stdio.h>
main()
{
	int s,i,j,n;
	int k=0;
	printf("Enter n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(s=1;s<=n-1;++s)
		{
			printf(" ");
			s--;
			
		}
		while(k!=2*i-1)
		printf("* ");
		k++;
		printf("\n");
		
		
	}
	
}
	
	

