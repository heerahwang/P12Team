package com.client;
import javax.swing.*;
import java.awt.*;

//창은 한개 가지고 가는것 , 버튼을 누르면 전환시켜주는 식으로 해결 (감추어 놓았다가 처리)

public class Login extends JPanel{
	//그림정보를 가져온다.
	Image back;
	//로그인 입력창이 필요하다 , ID & PW
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2,b3;
	/*저장(초기화 - 생성자 사용)
	JPanel => 로딩
	1) 생성자 호출
	2)  update() => clearRect()
		paint() => paintComponent()  
		화면이 변경될 때 자동으로 호출된다.
		
		++)더블버퍼링(변경되는 모든 내용은 메모리 상에서 이뤄지는 것이고 완성된 그림을 집어넣어 주는 것)
		
	*/
	public Login()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\image\\back.png");
		//이미지 불러오는것 getDefaultToolkit
		
		//버튼들 메모리 할당
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("회원가입");
		b2=new JButton("취소");
		b3=new JButton("Login");
		
		//배치 (gridlayout -> 같은 크기의 모양을 만드는데 사용)
		//setLayout(new GridLayout(3, 2,5,5)); //좌우 띄는 간격 5,5씩 <= 요런식으로하면 안돼 사용자가 직접정하도록 만들자
		setLayout(null);
		la1.setBounds(280,415,30,30);
		tf.setBounds(315,415,150,30);
		la2.setBounds(280,450,30,30);
		pf.setBounds(315,450,150,30);
		b3.setBounds(470,415,65,65);
		
		JPanel p=new JPanel(); //FlowLayout 패널로 딱 묶어서 가운데에 뜨게 도와줌
		p.add(b1);
		p.add(b2);
		p.setBounds(307,480,200,40);//위치지정
		p.setOpaque(false);//투명하게 만든다
		
		//추가
		add(la1);add(tf);add(b3);
		add(la2);add(pf);
		add(p);
		
		
	}
	
	//내가 paint한거를 부르지도 않았는데 실행됬다 -> 생성자에서 먼저 paintComponent를 자동으로 호출해줬다는 소리
	//내가 크기를 조정할 때도 또 호출이 된다. (자동호출!)
	@Override
	protected void paintComponent(Graphics g) {
		//창에 그림 입히는 것-skin 입힐때는 꼭 paintComponet 쓰자 paint 쓰지 말 것
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
//g - 그림을 그리라는 명령을 내리는 것 ,(back이라는 그림을 , [x와y는 그림이 그려지기 시작하는 위치]에 꽉채워라 ,내 패널위에=this )
		
	}

}
