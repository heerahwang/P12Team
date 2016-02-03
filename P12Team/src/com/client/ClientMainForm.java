package com.client;
import java.awt.*; // layout
import java.awt.event.*;
import javax.swing.*; // window
import java.util.Scanner;

public class ClientMainForm extends JFrame implements ActionListener, MouseMotionListener {
	CardLayout card = new CardLayout();
	Login login = new Login();
	WaitRoom wr = new WaitRoom();
	Member memb = new Member();
	TimerTest timer = new TimerTest();
	CreateRoom cr = new CreateRoom();
	Loading ld=new Loading();
	GameRule gr=new GameRule();
	//MouseMain mouseMa = new MouseMain();
	
	public ClientMainForm(){
		setLayout(card);	// BoarderLayout => CardLayout
		//add("Cursur", mouseMa);   

		add("LOG", login);
		add("Member", memb);
		add("WR", wr);
		add("TIMER", timer);
		add("CreateRoom", cr);
		add("Loading", ld);
		add("GameRule",gr);
		// 
		setSize(800, 600);
		// 
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		login.b3.addActionListener(this);
		
		wr.tf.addActionListener(this);
		wr.b6.addActionListener(this);
		wr.b1.addActionListener(this);
		wr.b5.addActionListener(this);
		cr.b1.addActionListener(this);
		memb.b2.addActionListener(this);
		gr.b1.addActionListener(this);
		//addMouseMotionListener(this);
		
	}
	public static void main(String[] args) {
		//
		try{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		ClientMainForm cm = new ClientMainForm();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == wr.tf){
			String data = wr.tf.getText();
			wr.ta.append(data + "\n"); //
			wr.tf.setText("");
		}
		else if(e.getSource() == login.b1){
			card.show(getContentPane(), "Member");
		}
		else if(e.getSource() == login.b2){
			System.exit(0);
		}
		else if(e.getSource() == login.b3){
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource() == wr.b6){
			card.show(getContentPane(), "LOG");
		}
		else if(e.getSource()==wr.b1)
		{
			card.show(getContentPane(), "CreateRoom");
		}
		else if(e.getSource()==cr.b1)
		{
			card.show(getContentPane(), "WR");
			Object[] data={cr.scan,cr.box,"full"};
		    wr.model1.addRow(data);
		}
		else if(e.getSource()==wr.b5)
		{
			card.show(getContentPane(), "GameRule");
		}
		else if(e.getSource() == memb.b2)
		{
			card.show(getContentPane(), "LOG");
		}
		else if(e.getSource() == gr.b1)
		{
			card.show(getContentPane(), "WR");
		}
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//mouseMa.x = e.getX()-20;
		//mouseMa.y = e.getY()-50;
		//mouseMa.repaint();
		
	}
}
