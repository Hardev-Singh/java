import java.awt.*;
class rr extends Frame

{
Button b1,b2;
Label l1,l2,l3,l4l;
TextField t1,t2;
Panel p;
rr(String s)
{
	super(s);
	setBackground(Color.RED);
	setLayout(null);
	setSize(500,300);
	setVisible(true);
	
	l1=new Label("calculator");
	l1.setBackground(Color.WHITE);
	l1.setBounds(150,60,60,20);
	add(l1);
	
	p=new Panel();
	p.setBackground(Color.YELLOW);
	p.setBounds(50,100,300,200);
	add(p);
	
	l2=new Label("Enter 1st no.");
	l2.setBounds(60,110,80,20);
	p.add(l2);
	
	t1=new TextField();
	t1.setForeground(Color.BLUE);
	t1.setBounds(150,100,50,20);
	p.add(t1);
	
	l3=new Label("Enter 2nd no.");
	//l3.setBounds(60,150,80,20);
	p.add(l3);
	
	t2=new TextField();
	t2.setForeground(Color.BLUE);
	t2.setBounds(150,150,50,20);
	p.add(t2);
	
	b1=new Button("+");
	b1.setBounds(50,200,40,30);
	p.add(b1);
	
	b2=new Button("clear");
	b2.setBounds(90,200,40,30);
	p.add(b2);
	
	l4l=new Label("Answer=");
	l4l.setBounds(70,250,120,20);
	p.add(l4l);
}
public static void main(String s[])
{
	new rr("Hello");
}

}