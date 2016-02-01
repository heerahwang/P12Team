package com.client;

import java.awt.*;
import javax.swing.*;

public class Login  extends JPanel{
	Image back;
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2, b3;
	
	public Login() {
		//
		back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist\\git\\P12Team\\P12Team\\lib\\back.png");
		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("회원가입");
		b2 = new JButton("취소");
		b3 = new JButton("Login");
		
		//
		setLayout(null); //
		la1.setBounds(280,415,30,30);
		tf.setBounds(315,415,150,30);
		la2.setBounds(280,450,30,30);
		pf.setBounds(315,450,150,30);
		b3.setBounds(470,415,65,65);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(307,480,200,40);
		p.setOpaque(false);

		//
		add(la1);	add(tf);	add(b3);
		add(la2);	add(pf);
		add(p);
	}
	@Override	//
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}

}
