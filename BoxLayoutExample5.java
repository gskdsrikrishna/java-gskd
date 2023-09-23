import java.awt.*;    
import javax.swing.*;    
public class BoxLayoutExample5 extends Frame   
{    
Button buttons[];    
public BoxLayoutExample5()   
{    
JFrame f = new JFrame();  
buttons = new Button[5];   
Box horizontalBox = Box.createHorizontalBox();   
Container contentPane = f.getContentPane();  
for (int i = 0; i < 5; i++)   
{    
  buttons[i] = new Button ("Button " + (i + 1));   
  horizontalBox.add(buttons[i]);    
}    
contentPane.add(horizontalBox, BorderLayout.NORTH);  
f.setLayout (new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));  
f.setSize(400, 400);    
f.setVisible(true);    
}    
public static void main(String argvs[])  
{    
BoxLayoutExample5 obj = new BoxLayoutExample5();  
}    
}   