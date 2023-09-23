import javax.swing.*;  
import java.awt.*;  
public class MySpringDemo1   
{  
public static void main(String argvs[])  
{  
JFrame.setDefaultLookAndFeelDecorated(true);  
JFrame f = new JFrame("Spring Layout Example");  
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
f.setSize(310, 210);  
Container cntt = f.getContentPane();  
SpringLayout sprLayout = new SpringLayout();  
f.setLayout(sprLayout);  
Component btn1 = new JButton("C++");   
Component btn2 = new JButton("Python");  
Component btn3 = new JButton("JAVA");  
Component btn4 = new JButton("NETWORKING");  
f.add(btn1);   
f.add(btn2);  
f.add(btn3);  
f.add(btn4);  
sprLayout.putConstraint(SpringLayout.WEST, btn1,  
24, SpringLayout.WEST, cntt);  
sprLayout.putConstraint(SpringLayout.NORTH, btn1,  
    9, SpringLayout.NORTH, cntt);  
sprLayout.putConstraint(SpringLayout.WEST, btn2,  
49, SpringLayout.WEST, cntt);  
sprLayout.putConstraint(SpringLayout.NORTH, btn2,  
        10, SpringLayout.SOUTH, btn1);  
sprLayout.putConstraint(SpringLayout.WEST, btn3,  
74, SpringLayout.WEST, cntt);  
sprLayout.putConstraint(SpringLayout.NORTH, btn3,  
        9, SpringLayout.SOUTH, btn2);   
sprLayout.putConstraint(SpringLayout.WEST, btn4,  
        14, SpringLayout.EAST, btn1);  
sprLayout.putConstraint(SpringLayout.NORTH, btn4,  
    9, SpringLayout.NORTH, cntt);   
f.setVisible(true);  
}  
}  