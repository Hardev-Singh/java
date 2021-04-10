class a implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++)
			System.out.println("Thread a"+i);
	}
}
class b implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++)
			System.out.println("Thread b"+i);
	}
}
public class runnableThread
{
	public static void main(String s[])
	{
		a a1=new a();
		Thread thread=new Thread(a1);
		thread.start();
		b b1=new b();
		Thread thread2=new Thread(b1);
		thread2.start();
		System.out.println("BYE");
	}
} 