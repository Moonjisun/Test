package client.gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//아이디 저장 체크박스 라벨   자동 로그인 체크박스 라벨

public class ChangePW extends JFrame{
	
	private JLabel pw = new JLabel("새로운 비밀번호 :");
	private JTextField pwText = new JTextField();
	private JLabel repeatpw = new JLabel("비밀번호 재입력 :");
	private JTextField repeatpwText = new JTextField();
	private JLabel same = new JLabel("비밀번호가 서로 일치하지 않습니다.");
	private JButton ok = new JButton("확인");
	private JButton cancel = new JButton("취소");

	
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
		
		this.setTitle("비밀번호 변경");
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

