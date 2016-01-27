package com.client;
import java.awt.*;//Layout
import javax.swing.*;//window
import java.awt.event.*;//�씤�꽣�럹�씠�뒪.
//
public class ClientMainForm extends JFrame 
implements ActionListener
{ //ActionListener �븘�닔!!!!!! 
	
	CardLayout card = new CardLayout();
	Login login = new Login(); //login �� �뙣�꼸
	WaitRoom wr=new WaitRoom();
	Wrong wg=new Wrong();
	error er=new error();
	
	public ClientMainForm()
	{
		setLayout(card);//JFrame�씠 �썝�옒 媛�吏�怨� �엳�뜕 BorderLayout�쓣 setLayout�쓣 �넻�빐 蹂�寃�
		add("LOG",login); //login �뙣�꼸�쓣 �쐢�룄�슦 李쎌뿉 �삱�졇�떎.
		add("WRONG",wg);
		add("error",er);
		add("WR",wr);
		

		//�겕湲�
		setSize(800,600);
		//�쐢�룄�슦瑜� 蹂댁뿬�씪
		setVisible(true);
		setResizable(false);
		//�쐢�룄�슦 �겕湲� 怨좎젙
		
		//<�씠踰ㅽ듃 �벑濡�>
		login.b3.addActionListener(this);
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �깮�꽦�옄 
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
			//移대뱶(�뙣�꼸)瑜� 蹂댁뿬�떖�씪 -> WR �쓣 蹂댁뿬二쇰뒗 寃� /李쎌쓣 諛붽씀怨� �떢�쓣�븣�뒗 �븞�뿉 �엳�뒗 �뙣�꼸�쓣 諛붽퓭以뚯쑝濡쒖뜥 �븳 �쐢�룄�슦�뿉�꽌 蹂�寃�
		}
		else if(e.getSource()==wr.tf)
		{//梨꾪똿李� 留뚮뱾湲�
			String data = wr.tf.getText(); //�궡媛� �엯�젰�븳 媛믪쓣 媛�吏�怨� �삩�떎.
			wr.ta.append(data+"\n");//�뜲�씠�꽣瑜� 泥⑤��빐�씪 \n 혢혳臾몄뿉 諛묒쑝濡� �궡�젮媛� 
			wr.tf.setText("");//媛믪쓣 �삱�젮二쇰뒗寃� , 怨듬갚�쓣 �삱�젮以�寃껋씠湲� �븣臾몄뿉 ���솕李쎌씠 鍮꾩썙吏��뒗寃� 泥섎읆 蹂댁엫
		}
		
	}

}
