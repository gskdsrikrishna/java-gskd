//<applet code="DisplayImage.class" width="300" height="300"> </applet> 
import java.awt.*;  
import java.applet.*;  
public class DisplayImage extends Applet {  
  Image picture;  
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.jpg");  
  }  
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
  }  