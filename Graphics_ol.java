/*<html>
<applet code="Graphics_ol.class"
     ,height=400 width=620>
</applet>
</html>*/

import java.awt.*;
import java.applet.*;
public class Graphics_ol extends Applet
{
public void paint(Graphics g)
{
g.drawOval(20,30,70,70); 
g.drawOval(60,30,70,70); 
g.drawOval(100,30,70,70); 

g.drawOval(40,70,70,70);
g.drawOval(80,70,70,70); 
}
}