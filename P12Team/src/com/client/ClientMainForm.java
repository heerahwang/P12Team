package com.client;
import java.awt.*;//Layout
import javax.swing.*;//window
import java.awt.event.*;//占쎌뵥占쎄숲占쎈읂占쎌뵠占쎈뮞.
//
public class ClientMainForm extends JFrame 
implements ActionListener
{ //ActionListener 占쎈툡占쎈땾!!!!!! 
	
	CardLayout card = new CardLayout();
	Login login = new Login(); //login 占쏙옙 占쎈솭占쎄섯
	WaitRoom wr=new WaitRoom();
	Wrong wg=new Wrong();
	error er=new error();
	Member mb=new Member();
	
	public ClientMainForm()
	{
		setLayout(card);//JFrame占쎌뵠 占쎌뜚占쎌삋 揶쏉옙筌욑옙�⑨옙 占쎌뿳占쎈쐲 BorderLayout占쎌뱽 setLayout占쎌뱽 占쎈꽰占쎈퉸 癰귨옙野껓옙
		add("LOG",login); //login 占쎈솭占쎄섯占쎌뱽 占쎌맊占쎈즲占쎌뒭 筌≪럩肉� 占쎌궞占쎌죬占쎈뼄.
		add("WRONG",wg);
		add("error",er);
		add("WR",wr);
		add("Member",mb);
		

		//占쎄쾿疫뀐옙
		setSize(800,600);
		//占쎌맊占쎈즲占쎌뒭�몴占� 癰귣똻肉э옙�뵬
		setVisible(true);
		setResizable(false);
		//占쎌맊占쎈즲占쎌뒭 占쎄쾿疫뀐옙 �⑥쥙�젟
		
		//<占쎌뵠甕겹끋�뱜 占쎈쾻嚥∽옙>
		login.b3.addActionListener(this);
		login.b1.addActionListener(this);
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 占쎄문占쎄쉐占쎌쁽 
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
			//燁삳�諭�(占쎈솭占쎄섯)�몴占� 癰귣똻肉э옙�뼎占쎌뵬 -> WR 占쎌뱽 癰귣똻肉т틠�눖�뮉 野껓옙 /筌≪럩�뱽 獄쏅떽���⑨옙 占쎈뼟占쎌뱽占쎈르占쎈뮉 占쎈툧占쎈퓠 占쎌뿳占쎈뮉 占쎈솭占쎄섯占쎌뱽 獄쏅떽�벊餓λ슣�몵嚥≪뮇�쑅 占쎈립 占쎌맊占쎈즲占쎌뒭占쎈퓠占쎄퐣 癰귨옙野껓옙
		}
		else if(e.getSource() == login.b1)
		{
			card.show(getContentPane(), "Member");
			//燁삳�諭�(占쎈솭占쎄섯)�몴占� 癰귣똻肉э옙�뼎占쎌뵬 -> WR 占쎌뱽 癰귣똻肉т틠�눖�뮉 野껓옙 /筌≪럩�뱽 獄쏅떽���⑨옙 占쎈뼟占쎌뱽占쎈르占쎈뮉 占쎈툧占쎈퓠 占쎌뿳占쎈뮉 占쎈솭占쎄섯占쎌뱽 獄쏅떽�벊餓λ슣�몵嚥≪뮇�쑅 占쎈립 占쎌맊占쎈즲占쎌뒭占쎈퓠占쎄퐣 癰귨옙野껓옙
		}
		else if(e.getSource()==wr.tf)
		{//筌�袁る샒筌∽옙 筌띾슢諭얏묾占�
			String data = wr.tf.getText(); //占쎄땀揶쏉옙 占쎌뿯占쎌젾占쎈립 揶쏅�れ뱽 揶쏉옙筌욑옙�⑨옙 占쎌궔占쎈뼄.
			wr.ta.append(data+"\n");//占쎈쑓占쎌뵠占쎄숲�몴占� 筌ｂ뫀占쏙옙鍮먲옙�뵬 \n �삟�삾�눧紐꾨퓠 獄쏅쵐�몵嚥∽옙 占쎄땀占쎌젻揶쏉옙 
			wr.tf.setText("");//揶쏅�れ뱽 占쎌궞占쎌젻雅뚯눖�뮉野껓옙 , �⑤벉媛싷옙�뱽 占쎌궞占쎌젻餓ο옙野껉퍔�뵠疫뀐옙 占쎈르�눧紐꾨퓠 占쏙옙占쎌넅筌≪럩�뵠 �뜮袁⑹뜖筌욑옙占쎈뮉野껓옙 筌ｌ꼶�쓥 癰귣똻�뿫
		}
		
	}

}
