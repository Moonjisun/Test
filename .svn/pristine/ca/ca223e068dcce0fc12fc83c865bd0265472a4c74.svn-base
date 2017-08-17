package client.gui.main;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * 
 * @author 양영오, 문지선, 노승문
 * 
 * 버튼의 이미지, 라벨의 이미지 세팅을 위한 클래스
 *
 */
public class ImageSettings {
	/**
	 * 파일 주소 YNMusicPlayer_re/src/resources/image/(fileName)
	 *  
	 * @param bt 버튼(JButton)
	 * @param on 마우스를 올렸을 때의 이미지 파일 이름
	 * @param off 마우스가 없을 때의 이미지 파일 이름
	 */
	public ImageSettings(JButton bt, String on, String off){
		bt.setIcon(new ImageIcon(getImage(off)));
		bt.setRolloverIcon(new ImageIcon(getImage(on)));
		bt.setPressedIcon(new ImageIcon(getImage(on)));
		bt.setDisabledIcon(new ImageIcon(getImage(off)));
		bt.setContentAreaFilled(false);
		bt.setBorderPainted(false);
		bt.setBorder(null);
		bt.setFocusPainted(false);
	}
	
	
	/**
	 * 파일 주소 YNMusicPlayer_re/src/resources/image/(fileName)
	 * 
	 * @param bt 버튼(JButton)
	 * @param on 마우스를 올렸을 때의 이미지 파일 이름
	 * @param off 마우스가 없을 때의 이미지 파일 이름
	 * @param text 버튼의 텍스트
	 */
	public ImageSettings(JButton bt, String on, String off, String text){
		bt.setIcon(new ImageIcon(getImage(off)));
		bt.setRolloverIcon(new ImageIcon(getImage(on)));
		bt.setPressedIcon(new ImageIcon(getImage(on)));
		bt.setDisabledIcon(new ImageIcon(getImage(off)));
		bt.setContentAreaFilled(false);
		bt.setBorderPainted(false);
		bt.setBorder(null);
		bt.setFocusPainted(false);
	}
	
	/**
	 * 파일 주소 YNMusicPlayer_re/src/resources/image/(fileName)
	 * 
	 * @param lb 라벨(JLabel)
	 * @param fileName 라벨 배경 이미지 파일 이름
	 */
	
	public ImageSettings(JLabel lb, String fileName){
		lb.setIcon(new ImageIcon(getImage(fileName)));
	}
	
	/**
	 * 
	 * @param fileName 파일 이름
	 * @return Image를 리턴하여, 아이콘을 생성. 경로에 문제가 있으면 null 값 리턴
	 */

	private Image getImage(String fileName){
		try{
			return ImageIO.read(getClass().getResource("./../../../resources/image/"+ fileName));
		} catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
