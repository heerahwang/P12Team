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
	String[] col1 ={"방이름","공개/비공개","인원"};
	String[][] row1=new String[0][3];
	model1=new DefaultTableModel(row1,col1);
	table1=new JTable(model1);
	JScrollPane js1=new JScrollPane(table1);
	
	//접속자-T
	String[] col2 ={"ID","대화명","위치"};
	String[][] row2=new String[0][3]; //들어가는 string data 4개
	model1=new DefaultTableModel(row2,col2);
	table1=new JTable(model1);
	JScrollPane js2=new JScrollPane(table1);
	
	//채팅
		ta=new JTextArea();
		JScrollPane js3=new JScrollPane(ta);
		tf=new JTextField();
		/*box=new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");*/
		//빨강색 or 회색은 알림표시이므로 빨강색은 주로 여기에 설정 안하고 디폴트로 두고 감
	
	//동영상
		movie = new JPanel();
		movie.setBackground(Color.black);
		
	b1=new JButton("방만들기");
	b2=new JButton("방만들어가기");
	b3=new JButton("게임신청");
	b4=new JButton("쪽지보내기");
	b5=new JButton("정보보기");
	b6=new JButton("나가기");
	b7 = new JButton("보내기");
	
	//패널로 버튼 6개 묶어버림
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(3,2,5,5));
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	p.add(b6);
	
		
	//위치배치	
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
		//창에 그림 입히는 것-skin 입힐때는 꼭 paintComponet 쓰자 paint 쓰지 말 것
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
}
