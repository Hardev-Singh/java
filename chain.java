class A
{
int x;
A(int a)
{
x=a;
System.out.println("hello");
}
A()
{
System.out.println("HIIIIII");
}
}
class abhi
{
public static void main(String s[])
{
A a1=new A(4);
A a2=new A(8);
A a3=new A();
}
}