package client.gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import client.dao.UserDAO;

public class Login extends JDialog{
	//component
	private JButton[] mainBt = new JButton[5];
	private JTextField[] mainCell = new JTextField[2];
	private JCheckBox saveId = new JCheckBox("아이디 저장");
	
	//component option
	private final int LOGIN = 0;
	private final int SEARCH_ID = 1;
	private final int SEARCH_PW = 2;
	private final int SIGN_IN = 3;
	private final int EXIT = 4;
	
	private final int ID = 0;
	private final int PW = 1;
	
	
	
	private void buttonSettings(){
		for(int i=0;i<mainBt.length;i++) mainBt[i] = new JButton();
		
		mainBt[LOGIN].setBounds(210, 50, 80, 60);
		mainBt[SIGN_IN].setBounds(25, 145, 85, 25);
		mainBt[SEARCH_ID].setBounds(210, 145, 80, 25);
		mainBt[SEARCH_PW].setBounds(120, 145, 85, 25);
		
		mainBt[EXIT].setBounds(290,10,20,20);
	}
	
	private void cellSettings(){
		for(int i=0;i<mainCell.length;i++) mainCell[i] = new JTextField();
		
		mainCell[ID].setBounds(25, 50, 180, 25);
		mainCell[PW].setBounds(25, 85, 180, 25);
	}
	
	private void checkBoxSettings(){
		saveId.setBounds(20, 115, 100, 25);
	}
	
	private void buttonEventSettings(){
		mainBt[EXIT].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
					System.exit(0);
			}
		});
	}
	
	private void cellEventSettings(){
		mainCell[ID].setForeground(Color.GRAY);
		mainCell[ID].setText("ID");
		mainCell[ID].addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(mainCell[ID].getText().equals("")){
					mainCell[ID].setForeground(Color.GRAY);
					mainCell[ID].setText("ID");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(mainCell[ID].getText().equals("ID")){
					mainCell[ID].setForeground(Color.BLACK);
					mainCell[ID].setText("");
				}
			}
		});
		
		mainCell[PW].setForeground(Color.GRAY);
		mainCell[PW].setText("PW");
		mainCell[PW].addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(mainCell[PW].getText().equals("")){
					mainCell[PW].setForeground(Color.GRAY);
					mainCell[PW].setText("PW");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(mainCell[PW].getText().equals("PW")){
					mainCell[PW].setForeground(Color.BLACK);
					mainCell[PW].setText("");
				}
			}
		});
	}

	
	private void compInit(){

		this.setLayout(null);	
		
		buttonSettings();
		buttonEventSettings();
		cellSettings();
		cellEventSettings();
		checkBoxSettings();
		
		for(int i=0;i<mainBt.length;i++) this.add(mainBt[i]);
		for(int i=0;i<mainCell.length;i++) this.add(mainCell[i]);
		this.add(saveId);
		
	}

	public Login(){
		
		this.setTitle("Login");
		this.setSize(320,185);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.compInit();
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		new Login();
	}
}

