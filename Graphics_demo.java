/*<html>
<applet code="Graphics_demo.class"
     ,height=400 width=620>
</applet>
</html>*/

import java.awt.*;
import java.applet.*;
public class Graphics_demo extends Applet
{
public void paint(Graphics g)
{
g.drawLine(20,20,60,60);
g.drawRect(80,20,40,30);
g.fillRect(160,10,30,80);
g.drawRoundRect(100,100,80,50,30,30);
g.fillRoundRect(100,200,80,50,30,30);
}
}