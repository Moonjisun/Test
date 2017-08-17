package client.gui.main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class WindowSettings {
	// Frame move
	private int prevX = 0;
	private int prevY = 0;

	public WindowSettings(UI frame) {

		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				frame.setLocation(prevX + e.getX(), prevY + e.getY());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				prevX = frame.getLocation().x - e.getX();
				prevY = frame.getLocation().y - e.getY();
			}

			@Override
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
	}
}
