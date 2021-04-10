class A
{
int a=67;
void display()
{
a=a;
System.out.println(a);
System.out.println(a);
}
}
public class this_field
{
public static void main(String s[])
{
A a1=new A();
a1.display();
System.out.println(a1.a);
}
}

