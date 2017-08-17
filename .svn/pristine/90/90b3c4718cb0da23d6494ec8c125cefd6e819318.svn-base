package client.gui.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 * @author 양영오, 문지선, 노승문
 * 버튼 세팅을 담당하는 클래스(버튼, 슬라이더)
 * 생성자를 호출하는 것으로, 버튼의 위치, 버튼의 기능, 버튼의 이미지를 설정 가능
 * MinimSettings를 필요.
 */
public class ButtonSettings {
	
	private final Color BG = new Color(246,129,129);

	// button
	private JButton[] musicBt = new JButton[4];
	private JButton[] listBt = new JButton[2];
	private JButton[] windowBt = new JButton[3];
	private JSlider volSlider = new JSlider(JSlider.HORIZONTAL, -10, 0, 0);

	// button option
	// music
	private final int PLAY = 0;
	private final int PREV = 1;
	private final int NEXT = 2;
	private final int STOP = 3;
	// list
	private final int RANDOM = 0;
	private final int REPEAT = 1;
	// window
	private final int MINI = 0;
	private final int INFO = 1;
	private final int EXIT = 2;
	// on-off
	private final int ON = 0;
	private final int OFF = 1;


	private void buttonInit() {
		// button initialization
		for (int i = 0; i < musicBt.length; i++)
			musicBt[i] = new JButton();
		for (int i = 0; i < listBt.length; i++)
			listBt[i] = new JButton();
		for (int i = 0; i < windowBt.length; i++)
			windowBt[i] = new JButton();

		// button position
		musicBt[PREV].setBounds(21, 188, 45, 44);
		musicBt[STOP].setBounds(94, 188, 45, 44);
		musicBt[PLAY].setBounds(159, 188, 45, 44);
		musicBt[NEXT].setBounds(226, 188, 45, 44);

		listBt[REPEAT].setBounds(501, 165, 78, 28);
		listBt[RANDOM].setBounds(501, 204, 78, 28);

		//windowBt[INFO].setBounds(480, 5, 30, 25);
		windowBt[MINI].setBounds(501, 18, 34, 34);
		windowBt[EXIT].setBounds(545, 18, 34, 34);
	}

	private void buttonImage(MinimSettings ms) {
		// button image
		new ImageSettings(musicBt[PREV], "prev_off.png", "prev_on.png");
		new ImageSettings(musicBt[STOP], "stop_off.png", "stop_on.png");
		new ImageSettings(musicBt[PLAY], "start_off.png", "start_on.png");
		new ImageSettings(musicBt[NEXT], "next_off.png", "next_on.png");
		
		new ImageSettings(listBt[REPEAT], "option_off.png", "option_on.png");
		new ImageSettings(listBt[RANDOM], "option_off.png", "option_on.png");

		new ImageSettings(windowBt[MINI], "mini_off.png", "mini_on.png");
		new ImageSettings(windowBt[EXIT], "exit_off.png", "exit_on.png");
	}

	private void buttonAction(UI frame) {
		// music
		musicBt[PLAY].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (frame.ms.getPlayer().isPlaying()) {
					frame.ms.pause();
					new ImageSettings(musicBt[PLAY], "start_off.png", "start_on.png");
				} else {
					frame.ms.play();
					new ImageSettings(musicBt[PLAY], "pause_off.png", "pause_on.png");
				}
				musicBt[PLAY].repaint();
			}
		});

		musicBt[STOP].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (frame.ms.getPlayer().isPlaying()) {
					frame.ms.stop();
				}
			}
		});

		musicBt[NEXT].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.ms.next();
			}
		});

		musicBt[PREV].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.ms.prev();
			}
		});

		// list
		listBt[RANDOM].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});

		// window
		windowBt[MINI].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});

		windowBt[EXIT].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "정말 끌래요?", "EXIT?",
						JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)
					System.exit(0);
			}
		});
	}
	
	private void sliderSettings(MinimSettings ms){
		volSlider.setBounds(344, 200, 130, 20);
		volSlider.setMajorTickSpacing(10);
		volSlider.setBackground(BG);
		volSlider.setPaintTrack(true);
		
		volSlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				ms.volumeSettings(volSlider.getValue());
			}
		});
	}
	
	public ButtonSettings(UI frame) {
		buttonInit();
		buttonImage(frame.ms);
		buttonAction(frame);
		sliderSettings(frame.ms);

		for (int i = 0; i < musicBt.length; i++) frame.ps.getMainLb().add(musicBt[i]);
		for (int i = 0; i < listBt.length; i++) frame.ps.getMainLb().add(listBt[i]);
		for (int i = 0; i < windowBt.length; i++) frame.ps.getMainLb().add(windowBt[i]);
		frame.ps.getMainLb().add(volSlider);
	}
}


