import java.awt.*;    
import javax.swing.*;    
public class BoxLayoutExample3 extends Frame   
{    
Button buttons[];       
public BoxLayoutExample3()   
{    
buttons = new Button[5];  
setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);  
for (int i = 0; i < 5; i++)   
{    
  buttons[i] = new Button ("Button " + (i + 1));    
  add (buttons[i]);    
}    
setLayout (new BoxLayout(this, BoxLayout.LINE_AXIS));    
setSize(400, 400);    
setVisible(true);    
}    
public static void main(String argvs[])  
{     
BoxLayoutExample3 obj = new BoxLayoutExample3();    
}    
}    