package com.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Scanner;

public class CreateRoom extends JPanel{
	Image back;
	JTable table1, table2;
	DefaultTableModel model1, model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JLabel la1, la2;
	Scanner scan;
	
	public CreateRoom(){
		scan=new Scanner(System.in);
		back=Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist\\git\\P12Team\\P12Team\\lib\\back.png");
		tf=new JTextField(); 
		scan.nextLine();
		
		box=new JComboBox();
		box.addItem("user vs com");
		box.addItem("user vs user");
		la1 = new JLabel("������");
		la2 = new JLabel("�ο�");
		
		b1=new JButton("����");
		
		setLayout(null);
		la1.setBounds(280, 250, 120, 30);
		la2.setBounds(280, 300, 120, 30);
		tf.setBounds(350, 250, 150, 30);
		box.setBounds(350, 300, 120, 30);
		b1.setBounds(320, 350, 85, 30);
		
		add(tf);
		add(b1);
		add(la1);
		add(la2);
		add(box);
	
	}
	
	protected void paintComponent(Graphics g) {
		//â�� �׸� ������ ��-skin �������� �� paintComponet ���� paint ���� �� ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
}