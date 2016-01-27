package com.client;
import javax.swing.*;
import java.awt.*;
public class Wrong extends JPanel{
	
	JLabel la1;//텍스트
	JButton b1;//버튼
	public Wrong()
	{	
		
		la1=new JLabel("잘못 입력하셨습니다.");
		b1=new JButton("확인");
		
		setLayout(null);
		la1.setBounds(350,200,200,50);
		b1.setBounds(370,280,60,30);
		b1.setOpaque(true);
	
		
		add(la1); add(b1);
		
		
	}
	
	}
