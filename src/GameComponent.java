import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JComponent;


public class GameComponent extends JComponent implements GameView  {

	private static final long serialVersionUID = -2081524703782097383L;
	private static final Point NEXT_ORIGIN = new Point(20,20);
	private static final Point STORED_ORIGIN = new Point(20,104);
	private Showcase nextShowcase;
	private Showcase storedShowcase;
	private boolean isHost;
	
//	private PlayGrid playGrid;
	

	public GameComponent(boolean isHost) {
		this.isHost = isHost;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		nextShowcase = new Showcase(NEXT_ORIGIN);
		storedShowcase = new Showcase(STORED_ORIGIN);
		// TODO Remove this v
		if(this.isHost);
		this.setVisible(true);
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		drawAffected(g2);
	}
	
	private void drawAffected(Graphics2D g2){
		for(Block B:nextShowcase)
			if(B.hasChanged()){
				B.draw(g2);
				B.resetChanged();
			}
		
		for(Block B:storedShowcase)
			if(B.hasChanged()){
				B.draw(g2);
				B.resetChanged();
			}
		
//		for(Block B:playGrid)
//			if(B.hasChanged()){
//				B.draw(g2);
//				B.setChanged();
//			}
		
	}

	@Override
	public void updateAffected() {
		this.drawAffected((Graphics2D)this.getGraphics());
	}

	@Override
	public void updateAll() {
		// TODO this.affectAll();
		this.drawAffected((Graphics2D)this.getGraphics());
		
	}
	
}
