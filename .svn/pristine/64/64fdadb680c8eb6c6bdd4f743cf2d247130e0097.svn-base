package client.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignIn extends JDialog {

	private JTextField[] cell = new JTextField[6];
	private JButton[] bt = new JButton[3];

	private final int ID = 0;
	private final int PW = 1;
	private final int REPW = 2;
	private final int NAME = 3;
	private final int PHONE = 4;
	private final int EMAIL = 5;

	private final int JOIN = 0;
	private final int CANCEL = 1;
	private final int CHECK = 2;
	
	private Color RED = new Color(200,0,255,55);

	private void cellSettings() {
		for (int i = 0; i < cell.length; i++) cell[i] = new JTextField();
		cell[ID].setBounds(120, 20, 140, 30);
		cell[ID].setForeground(new Color(255,0,0));
		cell[PW].setBounds(120, 60, 140, 30);
		cell[REPW].setBounds(120, 100, 140, 30);
		cell[NAME].setBounds(120, 140, 140, 30);
		cell[PHONE].setBounds(120, 180, 210, 30);
		cell[EMAIL].setBounds(120, 220, 210, 30);
	}

	private void buttonSettings() {
		for(int i=0;i<bt.length;i++) bt[i] = new JButton();
		bt[JOIN].setBounds(120, 260, 95, 30);
		bt[CANCEL].setBounds(235, 260, 95, 30);
		bt[CHECK].setBounds(270, 20, 60, 30);
	}

	private void compInit() {
		this.setLayout(null);
		//this.setBackground(RED);
		//this.getContentPane().setBackground(RED); //투명도 설정

		for (int i = 0; i < cell.length; i++) this.add(cell[i]);
		for(int i=0;i<bt.length;i++) this.add(bt[i]);
	}

	public SignIn() {
		this.setSize(350, 310);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.cellSettings();
		this.buttonSettings();
		this.compInit();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SignIn();
	}

}
