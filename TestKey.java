/*<applet code="TestKey" width=300 height=100>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class TestKey extends Applet implements KeyListener
{
String msg="";
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("KeyPressed");
}
public void keyReleased(KeyEvent k)
{
showStatus("KeyRealesed");
}
public void keyTyped(KeyEvent k)
{
msg = msg+k.getKeyChar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg, 20, 40);
}
}