package com.client;
import javax.swing.*;
import java.awt.*;
public class Wrong extends JPanel{
	
	JLabel la1;//�ؽ�Ʈ
	JButton b1;//��ư
	public Wrong()
	{	
		
		la1=new JLabel("�߸� �Է��ϼ̽��ϴ�.");
		b1=new JButton("Ȯ��");
		
		setLayout(null);
		la1.setBounds(350,200,200,50);
		b1.setBounds(370,280,60,30);
		b1.setOpaque(true);
	
		
		add(la1); add(b1);
		
		
	}
	
	}
