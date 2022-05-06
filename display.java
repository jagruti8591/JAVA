/*<html>
<applet code="display.class"
     ,height=500 width=600>
</applet>
</html>*/

import java.awt.*;
import java.applet.*;
public class display extends Applet
{
public void paint(Graphics g)
{
g.setFont(new Font("Lucida Handwriting",2,24));
g.setColor(new Color(255,0,0));
g.drawString("Hello world",50,30);
System.out.println("In paint");
}
}