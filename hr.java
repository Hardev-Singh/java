import java.awt.*;
class hr extends Frame

{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
TextField t1;
Panel p;
hr(String s)
{
	super(s);
	setBackground(Color.BLACK);
	setLayout(null);
	setSize(300,400);
	setVisible(true);

   /* p=new Panel();
	p.setBackground(Color.GRAY);
	p.setBounds(0,30,300,40);
	add(p);
	*/
	t1=new TextField();
	t1.setForeground(Color.BLUE);
	t1.setBounds(20,30,140,30);
	add(t1);
	
	b1=new Button("clear");
	b1.setBounds(200,30,80,30);
	add(b1);
	
	b2=new Button("7");
	b2.setBounds(20,80,40,40);
	add(b2);
	
	b3=new Button("8");
	b3.setBounds(100,80,40,40);
	add(b3);
	b4=new Button("9");
	b4.setBounds(180,80,40,40);
	add(b4);
	b15=new Button("%");
	b15.setBounds(250,80,40,40);
	add(b15);
	b5=new Button("4");
	b5.setBounds(20,160,40,40);
	add(b5);
	b5=new Button("5");
	b5.setBounds(100,160,40,40);
	add(b5);
	b6=new Button("6");
	b6.setBounds(180,160,40,40);
	add(b6);
	b7=new Button("/");
	b7.setBounds(250,160,40,40);
	add(b7);
	b8=new Button("1");
	b8.setBounds(20,240,40,40);
	add(b8);
	b9=new Button("2");
	b9.setBounds(100,240,40,40);
	add(b9);
	
	b10=new Button("3");
	b10.setBounds(180,240,40,40);
	add(b10);
	b11=new Button("-");
	b11.setBounds(250,240,40,40);
	add(b11);
	b12=new Button("0");
	b12.setBounds(20,320,40,40);
	add(b12);
	b13=new Button("=");
	b13.setBounds(100,320,80,40);
	add(b13);
	
	b14=new Button("+");
	b14.setBounds(250,320,40,40);
	add(b14);
 }
public static void main(String s[])
{
	new hr("Hello");
}

}