
package client.gui.main;

import java.awt.Color;

import javax.swing.JFrame;
/**
 * 
 * @author 양영오, 문지선 노승문
 * 
 * 클라이언트의 UI 클래스.
 * main을 포함(실행파일이 될 예정).
 * Settings 클래스를 묶는 역할
 * Settings 클래스간의 데이터 공유가 필요하기 때문에, Settings 필드는 protected로 존재
 */
@SuppressWarnings("serial")
public class UI extends JFrame {
	
	protected MinimSettings ms = new MinimSettings();
	protected PanelSettings ps = new PanelSettings(this);
	protected ButtonSettings bs = new ButtonSettings(this);
	protected WindowSettings ws = new WindowSettings(this);

	
	public UI() {
		setSize(600, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setUndecorated(true);
		getContentPane().setBackground(new Color(0,0,0,0));
		setBackground(new Color(0,0,0,0));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new UI();
	}
}

