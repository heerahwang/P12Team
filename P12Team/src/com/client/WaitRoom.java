package com.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JPanel{
	Image back;
	JTable table1, table2;
	DefaultTableModel model1, model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JPanel movie;
	JButton b1, b2, b3, b4, b5, b6, b7;

public WaitRoom(){
	//main-T
	back=Toolkit.getDefaultToolkit().getImage("C:\\image\\back.png");
	String[] col1 ={"���̸�","����/�����","�ο�"};
	String[][] row1=new String[0][3];
	model1=new DefaultTableModel(row1,col1);
	table1=new JTable(model1);
	JScrollPane js1=new JScrollPane(table1);
	
	//������-T
	String[] col2 ={"ID","��ȭ��","��ġ"};
	String[][] row2=new String[0][3]; //���� string data 4��
	model1=new DefaultTableModel(row2,col2);
	table1=new JTable(model1);
	JScrollPane js2=new JScrollPane(table1);
	
	//ä��
		ta=new JTextArea();
		JScrollPane js3=new JScrollPane(ta);
		tf=new JTextField();
		/*box=new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");*/
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
	b7 = new JButton("������");
	
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
	js1.setBounds(10, 15, 500, 320);
	js3.setBounds(10, 340, 500, 180);
	tf.setBounds(10, 530, 400, 30);
	b7.setBounds(420, 530, 85, 30);
	js2.setBounds(515, 15, 265, 230);
	movie.setBounds(515, 255, 265, 180);
	p.setBounds(515, 440, 265, 120);
	p.setOpaque(false);
	add(js1);
	add(js2);
	add(js3);
	add(tf);
	add(b7);
	add(movie);
	add(p);
	


}
	
	protected void paintComponent(Graphics g) {
		//â�� �׸� ������ ��-skin �������� �� paintComponet ���� paint ���� �� ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
}
