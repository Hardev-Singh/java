class A
{
int x;
int y;
void set_xy()
{
x=2;
y=3;
}
void display_xy()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
}
class B extends A
{
int z;
void set_z()
{
z=11+y;
}
void display_yz()
{
System.out.println("y="+y);
System.out.println("z="+z);
}
}
class signal_inheritance
{
public static void main(String s[])
{
A a=new A();
a.set_xy();
a.display_xy();
B b=new B();
b.set_xy();
b.display_xy();
b.set_z();
b.display_yz();
}
}