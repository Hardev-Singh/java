class A
{
void show()
{
System.out.println("hello A");
}
}
class B extends A
{
void show()
{
System.out.println("hello B");
}
}
class demo
{
public static void main(String s[])
{
A a=new B();
a.show();
}
}
