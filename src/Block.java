import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Block{

	private static Block singleton = new Block();
	
	private static final Dimension OUTER = new Dimension(16, 16);
	private static final Dimension INNER = new Dimension(15, 15);
	private static Rectangle2D.Double rectangle = new Rectangle2D.Double();
	private BlockMetadata myMetadata; 
	private boolean changed;
	private Point origin;
	private Color color;
	
	public Block(){
	}

	public void draw(Graphics2D g2) {
		System.out.println("Drawing Origin: "+ origin);
		rectangle.setRect(origin.x, origin.y, OUTER.width, OUTER.height);
		g2.setColor(color);
		g2.fill(rectangle);
		
		g2.setColor(color.darker());
		g2.draw(rectangle);
		
		g2.setColor(color.darker());
		rectangle.setRect(origin.x+1, origin.y+1, INNER.width, INNER.height);
		g2.draw(rectangle);
		
	}

	public boolean hasChanged() {
		return changed;
	}

	public void resetChanged() {
		this.myMetadata.setChanged();
	}
	
	public static Block getInstance(){
		return singleton;
	}

	public void setMetadata(BlockMetadata blockMetadata) {
		this.myMetadata = blockMetadata;
		this.changed = myMetadata.getChanged();
		this.origin = myMetadata.getOrigin();
		this.color = myMetadata.getColor();
	}

}
