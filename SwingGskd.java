import java.awt.*;
import javax.swing.*;
public class SwingGskd
{
	JFrame f=new JFrame("Copying");
	SwingGskd()
	{
		JButton b=new JButton("Cancel");
		final ImageIcon icon = new ImageIcon("background.jpg");
    	JTextArea text = new JTextArea() 
    	{
      		Image img = icon.getImage();
      		// instance initializer
      		{setOpaque(false);}
      		public void paintComponent(Graphics graphics) 
      		{
       	 		graphics.drawImage(img,400,40, this);
       	 		super.paintComponent(graphics);
      		}
    	};
		b.setBounds(300,125,80,20);
		f.add(b);
		f.setSize(400,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new SwingGskd();
	}
}