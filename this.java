class A
{
int a=67;
void display(int x)
{
this.a=x;
System.out.println(x);
System.out.println(a);
}
}
public class this
{
public static void main(String s[])
{
A a1=new A();
a1.display(3);
System.out.println(a1.a);
}
}

