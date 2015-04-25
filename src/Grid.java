import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;


public class Grid implements Iterable<Block> {
	
	public static final int DEFAULT_BLOCK_SIZE = 16;
	private Point origin;
	private int size;
	private Dimension dim;
	private BlockMetadata[][] blockArray;
	
	private class GridIterator implements Iterator<Block>{
		
		private int current = -1;
		
		public GridIterator() {
		}

		@Override
		public boolean hasNext() {
			return current<size-1;
		}

		@Override
		public Block next() {
			current++;
			return blockArray[current%dim.width]
					[current/dim.height].toBlock();
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public Grid(Point origin, Dimension showcaseSize) {
		
		this.origin = origin;
		this.dim = showcaseSize;
		this.size = dim.height*dim.width;
		
		this.blockArray = new BlockMetadata[dim.width][dim.height];
		
		for(int i=0;i<dim.width;i++){
			for(int j=0;j<dim.height;j++){
				blockArray[i][j] = new BlockMetadata(new Coords(i, j), this.origin);
			}
		}
	}

	@Override
	public Iterator<Block> iterator() {
		return new GridIterator();
	}

}
