package client.gui;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//아이디 저장 체크박스 라벨   자동 로그인 체크박스 라벨

public class SearchID extends JDialog{
	
	private JLabel id = new JLabel("E-Mail :");
	private JTextField idText = new JTextField();
	private JLabel pw = new JLabel("휴대폰 번호 :");
	private JTextField pwText = new JTextField();
	private JButton ok = new JButton("확인");
	private JButton cancel = new JButton("취소");

	
	private void compInit(){

		this.setLayout(null);	
		
		this.id.setBounds(30, 30, 40, 25);
		this.idText.setBounds(140, 30, 130, 25);
		this.pw.setBounds(30, 65, 80, 25);
		this.pwText.setBounds(140, 65, 130, 25);
		this.ok.setBounds(60, 115, 60, 25);
		this.cancel.setBounds(180, 115, 60, 25);
		
		
		this.add(id);
		this.add(idText);
		this.add(pw);
		this.add(pwText);
		this.add(ok);
		this.add(cancel);
		
	}

	public SearchID(){
		
		this.setTitle("아이디 찾기");
		this.setSize(320,185);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.compInit();
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		new SearchID();
	}
}

