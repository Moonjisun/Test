package client.gui.main;

import java.io.FileInputStream;
import java.io.InputStream;

import ddf.minim.AudioPlayer;
import ddf.minim.Minim;

import java.io.File;


/**
 * 
 * @author �翵��, ������, ��¹�
 * Minim ������ ���� Ŭ����.
 * Minim�� java�� �����������, processing�̶�� �ڹٸ� ������� �� �� ���� �����ϴ� API��.
 * ���� Minim�� java���� ����ϱ� ���ؼ��� ������ �غ� �ʿ��ϴ�.
 *
 */
public class MinimSettings{
	private Minim minim;
	private AudioPlayer player;
	private File rootFolder = new File(sketchPath("/music/"));
	private File[] list = rootFolder.listFiles();
	private int num = 0;
	private boolean isRandom = false;
	
	public MinimSettings(){
		minim = new Minim(this);
		player = minim.loadFile("/music/"+list[num].getName());
		// new NextMusicThread(this).start(); //�̱���
	}
	
	
	// music button action
	/**
	 * �÷���.
	 * ���� �÷��� ����, ���� ������ �ڵ����� ���� ������ �Ѱ���.
	 */
	public void play(){ 
		player.play(); 
	}
	
	/**
	 * �Ͻ�����.
	 * ����߿��� �۵��ϸ�, ������ ��ġ�� �����.
	 */
	public void pause(){ player.pause(); }
	
	/**
	 * ����.
	 * ����߿��� �۵��ϸ�, ��� ��ġ�� �ʱ�ȭ�Ͽ�, ó������ �ǵ���.
	 */
	public void stop(){
		pause();
		player.rewind();
	}
	
	/**
	 * ���� ��.
	 * ��� �߿� �۵��ϸ�, ���� ������ �Ѿ.
	 * ���� �߿� �۵��ϸ�, ���� ������ �Ѿ �������.
	 * ���� ���� ����� on �����̸� ����Ʈ�� ����.
	 * ���� ���� ����� off �����̸� �ڵ����� ���� ������ �ѱ�.
	 * 
	 */
	public void next(){
		pause();
		player.rewind();
		if(isRandom) num = (int)(Math.random()*list.length);
		else num = (num+1)%list.length;
		player = minim.loadFile("/music/"+list[num].getName());
		play();
	}
	
	/**
	 * ���� ��.
	 * ��� �߿� �۵��ϸ�, ���� ������ �ǵ��ư�.
	 * ���� �߿� �۵��ϸ�, ���� ������ �ǵ��ư� ��� ����.
	 * ���� ���� ����� on �����̸� ����Ʈ�� ����.
	 * ���� ���� ����� off �����̸� �ڵ����� ���� ������ �ǵ��ư�.
	 */
	public void prev(){
		player.pause();
		player.rewind();
		if(isRandom) num = (int)(Math.random()*list.length);
		else num = (num+list.length-1)%list.length;
		player = minim.loadFile("/music/"+list[num].getName());
		play();
	}
	
	/**
	 * 
	 * @param size ���� ũ��
	 * AudioPlayer�� setVolume() �޼ҵ尡 �۵����� �ʴ� ������ �־�, 
	 * ����å���� setGain() �޼ҵ带 �̿�.
	 * gain ���� �ø� �Ҹ��� �ְ��� ����, ������ -10~0���� ����.
	 * -10.0�� ���, ������ mute���� ����ڰ� ������ �� �� �ְ� ��.(����� ��ȿ�ϴ�.)
	 */
	public void volumeSettings(float size){
		if(size>-10){
			player.unmute();
			player.setGain(size);
		}
		else if(size<=-10)
			player.mute();
	}
	
	public void setIsRandom(boolean isRandom){
		this.isRandom = isRandom;
	}
	
	// get Information
	public AudioPlayer getPlayer(){ return player; }
	
	
	public String getText(){
		if(player.getMetaData().title().equals(""))
			return player.getMetaData().fileName().substring(7, player.getMetaData().fileName().length()-4);
		
		else
			return player.getMetaData().title() + " - " + player.getMetaData().author();
	}
	
	
	// Minim setting method
	/**
	 * 
	 * @param fileName ���ϸ�
	 * @return ������ ���� ��θ� ����(String).
	 * Minim ������ ���� �޼ҵ�(�ݵ�� �ʿ�)
	 */
	public String sketchPath(String fileName) {
        return System.getProperty("user.dir") + "/src/data" + fileName;
    }
	
	
	/**
	 * 
	 * @param fileName ���ϸ�
	 * @return ������ InputStream�� ����(InputStream)
	 * Minim ������ ���� �޼ҵ�(�ݵ�� �ʿ�)
	 */
    public InputStream createInput(String fileName) {
        InputStream is = null;
        try{
            is = new FileInputStream(sketchPath(fileName));
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return is;
    }
}

/**
 * 
 * @author �翵��, ������, ��¹�
 * Thread�� �̿��Ͽ�, 
 * ������ ����ǰ� ������ ����, 
 * �ڵ����� ������ �޼ҵ带 �����Ŵ
 *
 */
//class NextMusicThread extends Thread{
//	MinimSettings ms;
//	public NextMusicThread(MinimSettings ms){
//		this.ms = ms;
//	}
//
//	@Override
//	public void run(){
//		while(true){
//			if(ms.getPlayer().position()>=ms.getPlayer().length()-50){
//				ms.stop();
//				ms.next();
//				
//			}
//			try{
//				Thread.sleep(200);
//			} catch(Exception e){}
//		}
//		
//	}
//}

