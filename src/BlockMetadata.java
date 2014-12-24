import java.awt.Color;
import java.awt.Point;


public class BlockMetadata {
	private boolean changed;
	private Point origin;
	private BlockType type;
	
	public BlockMetadata(Coords coords,Point ShowcaseOrigin){
		this.changed = true;
		this.origin = new Point(
				ShowcaseOrigin.x+coords.getX()*Grid.DEFAULT_BLOCK_SIZE,
				ShowcaseOrigin.y+coords.getY()*Grid.DEFAULT_BLOCK_SIZE
				);
		this.type = BlockType.EMPTY;
	}
	
	public Block toBlock(){
		Block result = Block.getInstance();
		result.setMetadata(this);
		return result;
	}

	public void setChanged() {
		this.changed = false;
		
	}

	public boolean getChanged() {
		return this.changed;
	}

	public Point getOrigin() {
		return this.origin;
	}

	public Color getColor() {
		return this.type.getColor();
	}
}