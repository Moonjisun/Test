package client.gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//���̵� ���� üũ�ڽ� ��   �ڵ� �α��� üũ�ڽ� ��

public class ChangePW extends JFrame{
	
	private JLabel pw = new JLabel("���ο� ��й�ȣ :");
	private JTextField pwText = new JTextField();
	private JLabel repeatpw = new JLabel("��й�ȣ ���Է� :");
	private JTextField repeatpwText = new JTextField();
	private JLabel same = new JLabel("��й�ȣ�� ���� ��ġ���� �ʽ��ϴ�.");
	private JButton ok = new JButton("Ȯ��");
	private JButton cancel = new JButton("���");

	
	private void compInit(){

		this.setLayout(null);	
		
		this.pw.setBounds(30, 30, 100, 25);
		this.pwText.setBounds(140, 30, 130, 25);
		this.repeatpw.setBounds(30, 65, 100, 25);
		this.repeatpwText.setBounds(140, 65, 130, 25);
		this.same.setBounds(50, 90, 250, 25);
		this.ok.setBounds(60, 115, 60, 25);
		this.cancel.setBounds(180, 115, 60, 25);
		
		
		this.add(pw);
		this.add(pwText);
		this.add(repeatpw);
		this.add(repeatpwText);
		this.add(same);
		this.add(ok);
		this.add(cancel);
		
	}

	public ChangePW(){
		
		this.setTitle("��й�ȣ ����");
		this.setSize(320,185);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.compInit();
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		new ChangePW();
	}
}

