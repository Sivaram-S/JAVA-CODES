package pkg6;

import java.awt.*;
import java.applet.*;

/*
 <applet code = "Appletdemo" width = 200 height = 60>
 </applet>
 */

@SuppressWarnings("deprecation")
public class Appletdemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Simple Applet", 20, 20);
	}

}
