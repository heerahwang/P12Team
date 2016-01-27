package com.client;
import javax.swing.*;
import java.awt.*;
public class error extends JPanel{
	
	JLabel la1;//텍스트
	JButton b1;//버튼
	public error()
	{	
		
		la1=new JLabel("존재하지 않는 회원정보입니다.");
		b1=new JButton("확인");
		
		setLayout(null);
		la1.setBounds(320,200,200,50);
		b1.setBounds(370,280,60,30);
		b1.setOpaque(true);
	
		
		add(la1); add(b1);
		
		
	}
	
	}