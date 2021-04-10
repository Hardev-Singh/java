class Fre
{
public static void main(String ar[])
{
int a[]={1,2,3,3,2,1,1,1,5,6,5,8,9,6};

static void frequencycount(int x[])
{
int i=0,j=0;
int fr[]=new int[x.length];
for(i=0;i<fr.length;i++)
{
fr[i]=0;
}
for(i=0;i<digit.length;i++)
{
for(j=0;j<digit.length;j++)
{
if(x[i]==x[j])
{
fr[i]++;
}
}
}
for(i=0;i<fr.length;i++)
{
System.out.println(" "+fr[i]);
}
}
}//class