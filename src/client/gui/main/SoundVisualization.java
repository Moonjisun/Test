package client.gui.main;

import javax.swing.JPanel;

import processing.awt.PSurfaceAWT.SmoothCanvas;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PSurface;


/**
 * 
 * @author 양영오, 문지선, 노승문
 * 
 * 플레이어의 사운드에 맞춰 움직이는 시각화 장치.
 * java를 기반으로 만들어진 processing이라는 언어를 사용.
 *
 */
class SoundVisualization extends PApplet{
	private MinimSettings ms;
	private JPanel svPn;
	private PSurface ps;
	private PFont font;
	private float x = 435;

	public SoundVisualization(MinimSettings ms, JPanel svPn) {
		this.ms = ms;
		this.svPn = svPn;
		
		ps = this.initSurface();
		ps.setSize(435, 96);
		SmoothCanvas smoothCanvas = (SmoothCanvas) ps.getNative();
		svPn.add(smoothCanvas);
		ps.startThread();
	}
	@Override
	public void settings(){ 
		size(435, 96); 
	}

	@Override
	public void setup() {
		background(246, 129, 129);
		stroke(246, 223, 223);
		fill(246, 129, 129, 200);
		frameRate(60);
		while(!ms.getPlayer().isPlaying()){
			delay(100);
		}
		
		font = createFont("font/서울남산체 B", 36);
		textFont(font);
	}

	@Override
	public void draw() {
		fill(246,129,129, 160);
		noStroke();
		
		if (ms.getPlayer().isPlaying()) {
			rect(0, 0, width, height);
			stroke(246, 223, 223);
			for (int i = 0; i < ms.getPlayer().bufferSize() - 6; i += 5) {
				float x1 = map(i, 0, ms.getPlayer().bufferSize(), 0, width);
				float x2 = map(i + 5, 0, ms.getPlayer().bufferSize(), 0, width);
				line(x1, height / 4 - ms.getPlayer().mix.get(i) * height / 4, x2,
						height / 4 - ms.getPlayer().mix.get(i + 5) * height / 4);
			}
		}
		else rect(0, 0, width, height);
		
		fill(246,233,233);
		text(ms.getText(), x--, 80);
		if(x<-ms.getText().length()*36) x = 436;
		svPn.repaint();
	}

}