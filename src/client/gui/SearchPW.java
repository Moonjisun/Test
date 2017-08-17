package client.gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//아이디 저장 체크박스 라벨   자동 로그인 체크박스 라벨

public class SearchPW extends JFrame{
	
	private JLabel id = new JLabel("ID :");
	private JTextField idText = new JTextField();
	private JButton checkId = new JButton("검색");
	private JLabel checkLabel = new JLabel("검색하신 아이디가 없습니다");
	private JLabel pw = new JLabel("휴대폰 번호 :");
	private JTextField pwText = new JTextField();
	private JButton ok = new JButton("확인");
	private JButton cancel = new JButton("취소");

	
	private void compInit(){

		this.setLayout(null);	
		
		this.id.setBounds(30, 20, 40, 25);
		this.idText.setBounds(110, 20, 130, 25);
		this.checkId.setBounds(250, 20, 70, 25);
		this.checkLabel.setBounds(110, 50, 190, 25);
		this.pw.setBounds(30, 80, 80, 25);
		this.pwText.setBounds(110, 80, 130, 25);
		this.ok.setBounds(75, 125, 60, 25);
		this.cancel.setBounds(195, 125, 60, 25);
		
		
		this.add(id);
		this.add(idText);
		this.add(pw);
		this.add(pwText);
		this.add(ok);
		this.add(cancel);
		this.add(checkId);
		this.add(checkLabel);
		
	}

	public SearchPW(){
		
		this.setTitle("비밀번호 찾기");
		this.setSize(340,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.compInit();
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		new SearchPW();
	}
}

