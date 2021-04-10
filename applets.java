import java.applet.*;
import java.awt.Graphics;
class applets extends Applet{
	//public static void main(String s[])
	String s="THE";
	public void init()
	{
		s=s+"new";
		System.out.println(s);
	}
	
		public void paint(Graphics g)
		{
			g.drawString("Hello To world of the applets",50,100);
		}
	
} 