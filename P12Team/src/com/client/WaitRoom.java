package com.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JPanel{
Image back;
JTable table1, table2;
DefaultTableModel model1, model2;

//3�� ä�ý� ��� (ä��â , textfield, + enterġ�� ����)
JTextArea ta;//ä��â
JTextField tf;
JComboBox box; //����ٲٷ���
JPanel movie;//������
JButton b1,b2,b3,b4,b5,b6;

public WaitRoom(){
	//main-T
	back=Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist\\Pictures\\back1.png");
	String[] col1 ={"���̸�","����/�����","�ο�"};
	String[][] row1=new String[0][3];
	model1=new DefaultTableModel(row1,col1);
	table1=new JTable(model1);
	JScrollPane js1=new JScrollPane(table1);
	
	//������-T
	String[] col2 ={"ID","��ȭ��","����","��ġ"};
	String[][] row2=new String[0][4]; //���� string data 4��
	model1=new DefaultTableModel(row2,col2);
	table1=new JTable(model1);
	JScrollPane js2=new JScrollPane(table1);
	
	//ä��
		ta=new JTextArea();
		JScrollPane js3=new JScrollPane(ta);
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");
		//������ or ȸ���� �˸�ǥ���̹Ƿ� �������� �ַ� ���⿡ ���� ���ϰ� ����Ʈ�� �ΰ� ��
	
	//������
		movie = new JPanel();
		movie.setBackground(Color.black);
		
	b1=new JButton("�游���");
	b2=new JButton("�游����");
	b3=new JButton("���ӽ�û");
	b4=new JButton("����������");
	b5=new JButton("��������");
	b6=new JButton("������");
	
	//�гη� ��ư 6�� �������
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(3,2,5,5));
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	p.add(b6);
		
	//��ġ��ġ	
	setLayout(null);
	js1.setBounds(15,15,500,320);//��ġ��ġ
	js2.setBounds(15,340,500,215);
	js3.setBounds(520,15,255,200);
	tf.setBounds(520, 220, 170, 30);
	box.setBounds(695, 220, 80,30 );
	movie.setBounds(520,255,255,180);
	p.setBounds(520, 440, 255,115);
	p.setOpaque(false);
	//�гο� �߰��ض�
	add(js1);
	add(js2);
	add(js3);
	add(tf);//�Է�â �߰�
	add(box);
	add(movie);
	add(p);
	


}
	
	protected void paintComponent(Graphics g) {
		//â�� �׸� ������ ��-skin �������� �� paintComponet ���� paint ���� �� ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
}
