/*package com.sist;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class MouseMain extends JPanel {
	Image back, move;
	int x, y;
	
	public MouseMain(){
		back = Toolkit.getDefaultToolkit().getImage("c:\\image\\back.png");
		move = Toolkit.getDefaultToolkit().getImage("c:\\image\\left.gif");
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(move, x, y, this);
	}

}*/
