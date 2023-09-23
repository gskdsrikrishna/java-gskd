//<applet code="rottenapplet.class" height=300 width=300></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class rottenapplet implements ActionListener{
JPanel mainpanel=new JPanel(new GridLayout (3,1));
JPanel p1=new JPanel(new 
FlowLayout(0));
JPanel p2=new JPanel(new FlowLayout (0));
JPanel p3=new JPanel(new FlowLayout ());
JTextField q1=new JTextField (10);
JTextField q2=new JTextField (10);
JButton clickbutton = new JButton("convert");
public void init(){
getContentPane().add(mainpanel);	
mainpanel.add(p1);
mainpanel.add(p2);
mainpanel.add(p3);
p1.add(new JLabel("Insert Decimal:"));
p1.add(q1);
p2.add(clickbutton);
p3.add(new JLabel("Decimal to Binary:"));
p3.add(q2);
clickbutton.addActionListener(this);}
public void actionPerformed(ActionEvent x){
if(x.getSource()==clickbutton){
int counter,dec,user;
user=Integer.valueOf(q1.getText()).intValue();
String[]conversion=new String[8];
String[]complete=new String[4];
counter=0;
complete[0]="";
do{
dec=user%2;
conversion[counter]=String.valueOf(dec);
complete[0]=conversion[counter]+complete[0];
user=user/2;
counter+=1;}
while(user !=0);
q2.setText(String.valueOf(complete[user]));
}
}
}
