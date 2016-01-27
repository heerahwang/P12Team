package com.client;
import javax.swing.*;
import java.awt.*;

//â�� �Ѱ� ������ ���°� , ��ư�� ������ ��ȯ�����ִ� ������ �ذ� (���߾� ���Ҵٰ� ó��)

public class Login extends JPanel{
	//�׸������� �����´�.
	Image back;
	//�α��� �Է�â�� �ʿ��ϴ� , ID & PW
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2,b3;
	/*����(�ʱ�ȭ - ������ ���)
	JPanel => �ε�
	1) ������ ȣ��
	2)  update() => clearRect()
		paint() => paintComponent()  
		ȭ���� ����� �� �ڵ����� ȣ��ȴ�.
		
		++)������۸�(����Ǵ� ��� ������ �޸� �󿡼� �̷����� ���̰� �ϼ��� �׸��� ����־� �ִ� ��)
		
	*/
	public Login()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\image\\back.png");
		//�̹��� �ҷ����°� getDefaultToolkit
		
		//��ư�� �޸� �Ҵ�
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("ȸ������");
		b2=new JButton("���");
		b3=new JButton("Login");
		
		//��ġ (gridlayout -> ���� ũ���� ����� ����µ� ���)
		//setLayout(new GridLayout(3, 2,5,5)); //�¿� ��� ���� 5,5�� <= �䷱�������ϸ� �ȵ� ����ڰ� �������ϵ��� ������
		setLayout(null);
		la1.setBounds(280,415,30,30);
		tf.setBounds(315,415,150,30);
		la2.setBounds(280,450,30,30);
		pf.setBounds(315,450,150,30);
		b3.setBounds(470,415,65,65);
		
		JPanel p=new JPanel(); //FlowLayout �гη� �� ��� ����� �߰� ������
		p.add(b1);
		p.add(b2);
		p.setBounds(307,480,200,40);//��ġ����
		p.setOpaque(false);//�����ϰ� �����
		
		//�߰�
		add(la1);add(tf);add(b3);
		add(la2);add(pf);
		add(p);
		
		
	}
	
	//���� paint�ѰŸ� �θ����� �ʾҴµ� ������� -> �����ڿ��� ���� paintComponent�� �ڵ����� ȣ������ٴ� �Ҹ�
	//���� ũ�⸦ ������ ���� �� ȣ���� �ȴ�. (�ڵ�ȣ��!)
	@Override
	protected void paintComponent(Graphics g) {
		//â�� �׸� ������ ��-skin �������� �� paintComponet ���� paint ���� �� ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
//g - �׸��� �׸���� ����� ������ �� ,(back�̶�� �׸��� , [x��y�� �׸��� �׷����� �����ϴ� ��ġ]�� ��ä���� ,�� �г�����=this )
		
	}

}
