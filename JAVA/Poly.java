import java.awt.*;
import java.applet.*;
/* <Applet
	code=Poly
	Height=100
	Width=100>
	</applet>*/

public class Poly extends Applet
{
	public void paint(Graphics g)
	{
		int xpoint[]={20,120,220,20};
		int ypoint[]={20,120,20,20};
		int n=xpoint.length;
		Color gr=new Color(0,255,0);
		g.setColor(gr);
		g.fillPolygon(xpoint,ypoint,n);

	}
}