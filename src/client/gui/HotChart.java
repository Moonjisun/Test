package client.gui;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class HotChart extends JFrame{
	private JCheckBox box = new JCheckBox();
	private JButton search = new JButton("검색");
	private JButton num = new JButton("순위");
	private JButton change = new JButton("변동");
	private JButton song = new JButton("곡명");
	private JButton time = new JButton("시간");
	private JButton singer = new JButton("아티스트");
	private JButton love = new JButton("좋아요");
	private JTextField textField = new JTextField();
	private JScrollPane scroll = new JScrollPane();
	private JLabel label = new JLabel();
	

	private void compInit(){
	
		this.setLayout(null);
		this.setTitle("YNMusicplayer 인기챠트");
		this.textField.setBounds(10, 5, 370, 25);
		this.search.setBounds(390, 5, 70, 25);

		this.box.setBounds(8, 30, 30, 30);
		this.num.setBounds(40, 35, 60, 25);
		this.change.setBounds(100, 35, 60, 25);
		this.song.setBounds(160, 35, 60, 25);
		this.time.setBounds(220, 35, 60, 25);
		this.singer.setBounds(280, 35, 100, 25);
		this.love.setBounds(380, 35, 80, 25);
		this.label.setBounds(10, 65, 460, 480);

		this.add(textField);
		this.add(search);

		this.add(box);
		this.add(num);
		this.add(change);
		this.add(song);
		this.add(time);
		this.add(singer);
		this.add(love);
		this.add(label);
//		label.setBorder(new LineBorder(Color.DARK_GRAY));
		label.setBorder(new LineBorder(Color.BLACK));
		scroll = new JScrollPane(label,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(10, 65, 460, 480);
		this.add(scroll);
	}
	public HotChart(){
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		//		this.setUndecorated(true);//프레임 테두리 삭제
		this.compInit();
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		new HotChart();
	}

}
