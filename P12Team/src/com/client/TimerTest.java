package com.client;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class TimerTest extends JPanel {
	//JPanel gamePanel = new JPanel();
	JPanel timePanel;
	JProgressBar timeBar;
	JButton startBtn;
	JButton readyBtn;

	public TimerTest() {
		timePanel = new JPanel();
		timeBar = new JProgressBar();
		startBtn = new JButton("start");
		readyBtn = new JButton("ready");
		boolean readyConfirm = false;
		startBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed
				System.out.println("You clicked the button");
				if (e.getSource() == startBtn) {
						new Move().start();
						startBtn.setEnabled(false);
				}
			}
		});

		//timerThread = new Thread();
		timePanel.setBounds(100, 100, 500, 500);
		//Border border = BorderFactory.createTitledBorder("Timer!!");
		//timeBar.setBorder(border);

	
		add(timePanel);
		timePanel.add(timeBar);
		timePanel.add(startBtn);
		timePanel.add(readyBtn);
	}

	class Move extends Thread {
		public void run() {
			try {
				int num = 10;
				while (true) {
					System.out.println(num);
					timeBar.setValue(num);
					timeBar.setStringPainted(true);
					num--;
					Thread.sleep(100);
					if (num < 0){
						Thread.interrupted();
						break;
					}
				}
			} catch (Exception e) {}
			
		}
	}

	/*@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

	}*/

}
