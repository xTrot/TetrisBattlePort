import java.awt.Color;


public enum BlockType
{
	EMPTY(Color.LIGHT_GRAY),
	O_BLOCK(Color.YELLOW),
	I_BLOCK(Color.CYAN),
	S_BLOCK(Color.GREEN),
	Z_BLOCK(Color.RED),
	J_BLOCK(Color.BLUE),
	L_BLOCK(Color.LIGHT_GRAY);
	
	private Color blockColor;
	BlockType(Color color) { blockColor = color; }
	public Color getColor() { return blockColor; }
	
}