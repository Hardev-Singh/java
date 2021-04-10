class a extends Thread
{
	public void run(){
	//	System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread a"+i);
		/*	try{
			sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}*/
		}
	}
}
class b extends Thread
{
	public void run(){
		System.out.println(isAlive());
		System.out.println(Thread.currentThread().getName());
        System.out.println(isDaemon());

		for(int i=0;i<10;i++){
			if(i==5)
			//	stop();
		    yield();
			System.out.println("Thread b"+i);
			interrupt();
		}
	
	}
}
public class thread
{
	public static void main(String s[])
	{
		new a().start();
		new b().start();
	}
} 