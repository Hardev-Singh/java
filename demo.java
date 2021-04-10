import lalu.pagal.D;
import lalu.B;
class demo
{
public static void main(String s[])
{
System.out.println("hi");
A a1=new A();
a1.show();
System.out.println(a1.x);
D d1=new D();
d1.showD();
System.out.println(d1.m);
}
}
class A extends B
{
  int x=25;
void show()
{
System.out.println("hello A");
//B b1=new B();
//print();
System.out.println(y);
}
}