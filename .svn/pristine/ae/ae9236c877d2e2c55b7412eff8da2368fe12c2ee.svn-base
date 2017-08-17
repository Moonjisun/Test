package client.gui.main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 
 * @author 양영오, 문지선, 노승문
 * 
 * 패널 세팅을 위한 클래스(패널, 레이블)
 * 생성자를 호출하는 것으로, 버튼의 위치, 버튼의 기능, 버튼의 이미지를 설정 가능
 * UI를 필요.
 * 
 * 현재, SoundVisualization과의 문제가 발생(소리 재생 중 가끔 끊김 현상 발생. Minim의 자체적 오류인지, processing의 문제인지 확인 필요)
 *
 */
public class PanelSettings {

	private JPanel mainPn = new JPanel();
	private JLabel mainLb = new JLabel();
	private JPanel svPn = new JPanel();

	public PanelSettings(UI frame) {
		mainPn.setLayout(new GridLayout(1, 1));
		mainPn.setBackground(new Color(0, 0, 0, 0));

		new ImageSettings(mainLb, "bg.png");

		// Sound Visualization Settings
		svPn.setLayout(new GridLayout(1, 1));
		svPn.setBounds(39, 36, 435, 96);
		SoundVisualization sv = new SoundVisualization(frame.ms, svPn);
		mainLb.add(svPn);
		mainLb.setBounds(0, 0, 600, 250);
		mainLb.setLayout(null);
		mainPn.add(mainLb);

		frame.add(mainPn);
	}

	public JPanel getMainPn() {
		return mainPn;
	}

	public JLabel getMainLb() {
		return mainLb;
	}
}
