package client.gui.main;

import java.io.FileInputStream;
import java.io.InputStream;

import ddf.minim.AudioPlayer;
import ddf.minim.Minim;

import java.io.File;


/**
 * 
 * @author 양영오, 문지선, 노승문
 * Minim 세팅을 위한 클래스.
 * Minim은 java로 만들어졌지만, processing이라는 자바를 기반으로 한 언어를 위해 존재하는 API다.
 * 따라서 Minim을 java에서 사용하기 위해서는 별도의 준비가 필요하다.
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
		// new NextMusicThread(this).start(); //미구현
	}
	
	
	// music button action
	/**
	 * 플레이.
	 * 만일 플레이 도중, 곡이 끝나면 자동으로 다음 곡으로 넘겨줌.
	 */
	public void play(){ 
		player.play(); 
	}
	
	/**
	 * 일시정지.
	 * 재생중에만 작동하며, 정지한 위치를 기억함.
	 */
	public void pause(){ player.pause(); }
	
	/**
	 * 정지.
	 * 재생중에만 작동하며, 재생 위치를 초기화하여, 처음으로 되돌림.
	 */
	public void stop(){
		pause();
		player.rewind();
	}
	
	/**
	 * 다음 곡.
	 * 재생 중에 작동하면, 다음 곡으로 넘어감.
	 * 정지 중에 작동하면, 다음 곡으로 넘어가 재생시작.
	 * 랜덤 셔플 기능이 on 상태이면 리스트를 섞음.
	 * 랜덤 셔플 기능이 off 상태이면 자동으로 다음 곡으로 넘김.
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
	 * 이전 곡.
	 * 재생 중에 작동하면, 이전 곡으로 되돌아감.
	 * 정지 중에 작동하면, 이전 곡으로 되돌아가 재생 시작.
	 * 랜덤 셔플 기능이 on 상태이면 리스트를 섞음.
	 * 랜덤 셔플 기능이 off 상태이면 자동으로 이전 곡으로 되돌아감.
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
	 * @param size 볼륨 크기
	 * AudioPlayer의 setVolume() 메소드가 작동하지 않는 오류가 있어, 
	 * 차선책으로 setGain() 메소드를 이용.
	 * gain 값이 늘면 소리에 왜곡이 생겨, 범위를 -10~0으로 설정.
	 * -10.0의 경우, 음악을 mute시켜 사용자가 음악을 끌 수 있게 함.(재생은 유효하다.)
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
	 * @param fileName 파일명
	 * @return 파일의 절대 경로를 리턴(String).
	 * Minim 실행을 위한 메소드(반드시 필요)
	 */
	public String sketchPath(String fileName) {
        return System.getProperty("user.dir") + "/src/data" + fileName;
    }
	
	
	/**
	 * 
	 * @param fileName 파일명
	 * @return 파일의 InputStream을 리턴(InputStream)
	 * Minim 실행을 위한 메소드(반드시 필요)
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
 * @author 양영오, 문지선, 노승문
 * Thread를 이용하여, 
 * 음악이 재생되고 끝나는 순간, 
 * 자동으로 다음곡 메소드를 실행시킴
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

