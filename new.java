class A
{
int x=10;
void Show()
{
System.out.println("Hello");
}
A()
{
int x=5;
x=6;
System.out.println("Tncapp"+x);
}
}
class Demo
{
 public static void main(String s[])
 {
 A a1=new A();
 a1.Show();
 System.out.println(a1.x);
 
 }
 }
 

