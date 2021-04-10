class sort
{
public static void main(String s[])
{
int a[]={4,5,8,9,2,4,9,10};
int temp;
for(int x=0;x<8;x++)
{
	for(int y=0;y<7;y++)
	{
		if(a[y]>a[y+1])
		{
			temp=a[y];
			a[y]=a[y+1];
			a[y+1]=temp;
		}
	}
}
for(int x=0;x<8;x++)
	System.out.println(a[x]);
	
}
}