import java.awt.BorderLayout;  
import javax.swing.ButtonGroup;  
import java.awt.GridLayout;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.JLabel;  
import javax.swing.JScrollPane;  
import javax.swing.JRadioButton;  
public class ScrollPaneDemo1 extends JFrame   
{  
JScrollPane scrlpane;  
public ScrollPaneDemo1()  
{  
super("JScrollPane Rating Display");  
setSize(310, 210);   
setDefaultCloseOperation(EXIT_ON_CLOSE);  
inner();   
setVisible(true);  
}  
public void inner()  
{   
JRadioButton f[][] = new JRadioButton[12][5];  
String cnts[] = {"RATING ", "  *", " * * ",  
"* * * ", " * * * * ", " * * * * * "};  
String ctg[] = {"CCNA", "Design Patterns", "Java",  
     "Python", "Algorithms",  
    "JAVASCRIPT", "Operating System", "CS Subject",   
    "Data Structure", "PHP language", "Concurrency",  
    "C #" };   
JPanel panel = new JPanel();  
panel.setSize(610, 410);  
panel.setLayout(new GridLayout(13, 6, 10, 0));  
for (int r = 0; r < 13; r++) {  
ButtonGroup btngrp = new ButtonGroup();  
for (int c = 0; c < 6; c++)  
{  
if (r == 0)   
{   
panel.add(new JLabel(cnts[c]));  
}  
else {    
if (c == 0)  
{  
panel.add(new JLabel(ctg[r - 1]));  
}  
else  
{  
f[r - 1][c - 1] = new JRadioButton();   
btngrp.add(f[r - 1][c - 1]);  
panel.add(f[r - 1][c - 1]);  
}  }  }  }  
scrlpane = new JScrollPane(panel);  
getContentPane().add(scrlpane, BorderLayout.CENTER);  
}  
public static void main(String argvs[])  
{  
new ScrollPaneDemo1();  
}  
}  