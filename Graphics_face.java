/*<html>
<applet code="Graphics_face.class"
     ,height=400 width=620>
</applet>
</html>*/

import java.awt.*;
import java.applet.*;
public class Graphics_face extends Applet
{
public void paint(Graphics g)
{
g.drawLine(30,30,48,48);
g.drawLine(40,40,48,48);


g.drawOval(30,30,110,130); //head
g.drawOval(47,65,20,10);  //left eye
g.drawOval(100,65,20,10);  //right eye
g.fillOval(52,65,10,10);  //left pupil
g.fillOval(105,65,10,10); //right pupil
g.drawOval(15,75,15,30); //left ear
g.drawOval(140,75,15,30); //right ear

g.fillArc(56,105,60,40,180,180);  //mouth

g.setColor(Color.red);
g.fillOval(75,85,25,25); //nose

}
}