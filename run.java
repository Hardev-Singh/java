class A
{
int x=10;
void show()
{
System.out.println("hello A");
}
void print()
{
System.out.println("hi A");
}
}
class B extends A
{
int y=10;
void show()
{
System.out.println("hello B");
}
void display()
{
System.out.println("incapp B");
}
}
class C extends B
{
int z=30;
void show()
{
System.out.println("hello C");
}
}
class demo
{
public static void main(String s[])
{
A a=new A();
a.show();
a=new B();
a.show();
a=new C();
a.show();
}	
}