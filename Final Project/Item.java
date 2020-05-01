

public class Item extends MovableGamePiece {
	final int itemID;
	static final int size = 50;

	public Item(int xLoc, int yLoc, int itemIDIn) {
		super(xLoc, yLoc, Math.PI/2, 0, size, size);
		itemID = itemIDIn;
	}
	
	public int getID() {
		return itemID;
		
	}

}
