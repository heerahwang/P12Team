package com.client;
import javax.swing.*;
import java.awt.*;
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
	
    Cursor cursor;
    Image img;
	
	public WaitRoom(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        img = tk.getImage("C:\\image\\curser1.png");
        Point point = new Point(0,0);
        cursor = tk.createCustomCursor(img,point,"roman");
        setCursor(cursor);
		
		// Room information
		back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist\\git\\P12Team\\P12Team\\lib\\back.png");
		String[] col1 = {"���̸�", "����/�����", "�ο�"};
		String[] [] row1 = new String[0][3];
		model1 = new DefaultTableModel(row1, col1);
		table1 = new JTable(model1);
		JScrollPane js1 = new JScrollPane(table1);
		
		
		// stand by 
		String[] col2 = {"ID", "��ȭ��", "��ġ"};
		String[] [] row2 = new String[0][4];
		model1 = new DefaultTableModel(row2, col2);
		table1 = new JTable(model1);
		JScrollPane js2 = new JScrollPane(table1);
		
		// chatting
		ta = new JTextArea();
		JScrollPane js3 = new JScrollPane(ta);
		tf = new JTextField();
/*		box = new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");*/
		
		// media
		movie = new JPanel();
		movie.setBackground(Color.black);
		
		b1 = new JButton("�游���");
		b2 = new JButton("�����");
		b3 = new JButton("���ӽ�û");
		b4 = new JButton("����������");
		b5 = new JButton("��������");
		b6 = new JButton("������");
		b7 = new JButton("������");
		
		// There are 6 button in Panel
		JPanel p = new JPanel();
		p.setOpaque(false);
		p.setLayout(new GridLayout(3, 2, 5, 5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		
		// set location
		setLayout(null);
		js1.setBounds(10, 15, 500, 320);
		js2.setBounds(515, 15, 265, 230);
		js3.setBounds(10, 340, 500, 180);
		tf.setBounds(10, 530, 400, 30);
		//box.setBounds(690, 220, 90, 30);
		movie.setBounds(515, 255, 265, 180);
		p.setBounds(515, 440, 265, 120);
		b7.setBounds(420, 530, 85, 30);
		
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		//add(box);
		add(b7);
		add(movie);
		add(p);
	}
	@Override	// draw image 
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
}
