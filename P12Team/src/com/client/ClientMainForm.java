package com.client;
import java.awt.*;//Layout
import javax.swing.*;//window

import java.awt.event.*;//�������̽�
//
public class ClientMainForm extends JFrame 
implements ActionListener
{ //ActionListener �ʼ�!!!!!! 
	
	CardLayout card = new CardLayout();
	Login login = new Login(); //login �� �г�
	WaitRoom wr=new WaitRoom();
	
	public ClientMainForm()
	{
		setLayout(card);//JFrame�� ���� ������ �ִ� BorderLayout�� setLayout�� ���� ����
		add("LOG",login); //login �г��� ������ â�� �÷ȴ�.
		add("WR",wr);
		

		//ũ��
		setSize(800,600);
		//�����츦 ������
		setVisible(true);
		setResizable(false);
		//������ ũ�� ����
		
		//<�̺�Ʈ ���>
		login.b3.addActionListener(this);
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 
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
			//ī��(�г�)�� �����޶� -> WR �� �����ִ� �� /â�� �ٲٰ� �������� �ȿ� �ִ� �г��� �ٲ������ν� �� �����쿡�� ����
		}
		else if(e.getSource()==wr.tf)
		{//ä��â �����
			String data = wr.tf.getText(); //���� �Է��� ���� ������ �´�.
			wr.ta.append(data+"\n");//�����͸� ÷���ض� \n ������ ������ ������ 
			wr.tf.setText("");//���� �÷��ִ°� , ������ �÷��ذ��̱� ������ ��ȭâ�� ������°� ó�� ����
		}
		
	}

}
