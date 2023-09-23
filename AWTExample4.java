import java.awt.*;  
import java.awt.event.*;  
class AWTExample4 extends Frame{  
TextField tf;  
AWTExample4(){   
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
Outer o=new Outer(this);  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new AWTExample4();  
}  
}  
import java.awt.event.*;  
class Outer implements ActionListener{  
AWTExample4 obj;  
Outer(AWTExample4 obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("welcome");  
}  
}