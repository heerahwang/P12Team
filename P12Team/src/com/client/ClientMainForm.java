package com.client;
import java.awt.*;//Layout
import javax.swing.*;//window

import java.awt.event.*;//인터페이스
//
public class ClientMainForm extends JFrame 
implements ActionListener
{ //ActionListener 필수!!!!!! 
	
	CardLayout card = new CardLayout();
	Login login = new Login(); //login 은 패널
	WaitRoom wr=new WaitRoom();
	
	public ClientMainForm()
	{
		setLayout(card);//JFrame이 원래 가지고 있던 BorderLayout을 setLayout을 통해 변경
		add("LOG",login); //login 패널을 윈도우 창에 올렸다.
		add("WR",wr);
		

		//크기
		setSize(800,600);
		//윈도우를 보여라
		setVisible(true);
		setResizable(false);
		//윈도우 크기 고정
		
		//<이벤트 등록>
		login.b3.addActionListener(this);
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 
		try
		{
			 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex){}
		ClientMainForm cm=new ClientMainForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == login.b3)
		{
			card.show(getContentPane(), "WR");
			//카드(패널)를 보여달라 -> WR 을 보여주는 것 /창을 바꾸고 싶을때는 안에 있는 패널을 바꿔줌으로써 한 윈도우에서 변경
		}
		else if(e.getSource()==wr.tf)
		{//채팅창 만들기
			String data = wr.tf.getText(); //내가 입력한 값을 가지고 온다.
			wr.ta.append(data+"\n");//데이터를 첨부해라 \n 떄문에 밑으로 내려감 
			wr.tf.setText("");//값을 올려주는것 , 공백을 올려준것이기 때문에 대화창이 비워지는것 처럼 보임
		}
		
	}

}
