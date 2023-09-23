import java.awt.*;
public class GskdAwt extends Frame 
{
	GskdAwt()
	{
		Button b=new Button("Gskd");
		b.setBounds(20,110,90,40);
		add(b);
		setSize(400,400);
		setTitle("This is GskdAwt");
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		GskdAwt sk=new GskdAwt();
	}
}