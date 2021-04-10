class A
{
A()
{
this(;
System.out.println("hello");
}
A(int x)
{

System.out.println("hurrr");
}
}
class B extends A
{
B(int x)
{
super(5);
System.out.println("awesome");
}
B()
{
System.out.println("hocker");
}
}
class super_constructor
{
public static void main(String s[])
{
B b1=new B(6);
B b2=new B();
}
}












