package com.client;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class Member extends JPanel{
	
	Image back;
	JLabel la1,la2,la3,la4,la5,la6,la7;
	JTextField tf1,tf2;
	JPasswordField pf;
	JButton b1,b2;
	JRadioButton rb1,rb2;
	public Member()
	{	
		back=Toolkit.getDefaultToolkit().getImage("C:\\image\\back.png");
		la1=new JLabel("ȸ������");
		la2=new JLabel("�̸�");
		la3=new JLabel("ID");
		la4=new JLabel("PW");
		la5=new JLabel("����");
		la6=new JLabel("����");
		la7=new JLabel("����");
		rb1=new JRadioButton();
		rb2=new JRadioButton();
		b1=new JButton("�ߺ�üũ");
		b2=new JButton("���ԿϷ�");
		tf1=new JTextField("�̸��� �Է��ϼ���");////�̸��Է¶�
		tf2=new JTextField("ID�� �Է��ϼ���");//id�Է¶�
		pf=new JPasswordField();//pw�Է¶�
		
		
		setLayout(null);
		la1.setBounds(370,100,200,50);//ȸ������
		la2.setBounds(250,170,50,50);//�̸�
		la3.setBounds(250,220,50,50);//id
		la4.setBounds(250,270,50,50);//pw
		la5.setBounds(250,310,50,50);//����
		la6.setBounds(350,310,50,50);//��
		la7.setBounds(470,310,50,50);//��
		
		rb1.setBounds(300,310,50,50);//�� ������ư
		rb1.setOpaque(false);
		rb2.setBounds(420,310,50,50);//�� ������ư
		rb2.setOpaque(false);
		
		b2.setBounds(340,380,120,30);//���� ��ư
		b1.setBounds(530,230,100,30);//�ߺ�üũ��ư
		b1.setOpaque(false);
		tf1.setBounds(300, 180, 200, 30);//�̸��Է¶�
		tf2.setBounds(300, 230, 200, 30);//id�Է¶�
		pf.setBounds(300, 280, 200, 30);//pw�Է¶�
		
		
	
		add(la1);	add(la2); 
		add(la3);   add(la4); 
		add(la5);   add(la6);
		add(la7);
		add(tf1);	add(tf2);   add(pf);
		add(b1);	add(b2); 
		add(rb1);	add(rb2);
		
		
	}
	protected void paintComponent(Graphics g) {
		//â�� �׸� ������ ��-skin �������� �� paintComponet ���� paint ���� �� ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
}

/*

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
*/