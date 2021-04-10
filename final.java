class A
{
final int x=10;
//x=20;
final public void show()
{
System.out.println("show method of A");
System.out.println("x="+x);

}
class B extends A
{
 int x=20;
B()
{
x=10;
//x=20;
System.out.println("value of x="+x);
}
}
public class final
{
public Static void main(String s[])
{
B b=new B();
}
}
