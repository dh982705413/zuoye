#include<stdio.h>
int inputInt(int low,int high,char des[30])
{
	int temp,flag=0;
   	flag=scanf("%d",&temp);
	while(flag==0||temp>high||temp<low){
		printf(" ����%s,�������������ұ�����ڵ���%d,С�ڵ���%d\n",des,low,high);
		fflush(stdin);
		flag=scanf("%d",&temp);
	}
    return temp;
}
void triangle1()
{
	int tempa,thickness,i,j;
	int flag=0;
	printf("������ֱ�ǵ��������εĵ׳�(��С����2-120):");
	tempa=inputInt(2,120,"ֱ�ǵ��������εĵ׳�");

    printf("������ֱ�ǵ��������εĺ��(��С����1-%d):",tempa);
	thickness=inputInt(1,tempa,"ֱ�ǵ��������εĺ��");
		for(i=1;i<=tempa;i++)
		{
			if(i<=thickness)
		{
			for(j=1;j<=thickness;j++) 
				printf("#");
		}
		else if(i>tempa-thickness){
			for(j=1;j<=i;j++)
				printf("#");
		}
		else{
			for(j=1;j<=i;j++)
			{
				if(j<thickness+1)
					printf("#");
				else if(j>i-thickness)
					printf("#");
				else
					printf(" ");
			}
		}
		printf("\n");	
	}
}
main()
{
  triangle1();
  return 0;
}