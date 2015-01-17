import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;


public class StartGame {

	private static JFrame jFrame;
	private static GameComponent gc;

	public static void main(String[] args) {
		jFrame = new JFrame("Tetris Battle");
		jFrame.setBackground(Color.WHITE);
		jFrame.setSize(new Dimension(600, 400));
		jFrame.setLocation(20, 20);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO Game Setup goes here.
		gc = new GameComponent(true);
		jFrame.add(gc);

		jFrame.setVisible(true);
	}

}
