import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;


public class Showcase implements Iterable<Block>{

	private final static Dimension SHOWCASE_SIZE = new Dimension(4,4);
	private Grid showcaseGrid;
	private Point origin;
	
	public Showcase(Point origin) {
		this.origin = origin;
		showcaseGrid = new Grid(this.origin,SHOWCASE_SIZE);
	}
	
	@Override
	public Iterator<Block> iterator() {
		return showcaseGrid.iterator();
	}

}
