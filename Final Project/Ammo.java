
public abstract class Ammo extends MovableGamePiece {
	private final double damage;

	public Ammo(int xLoc, int yLoc, double angle, double speed, double width, double height, double damageIn) {
		super(xLoc, yLoc, angle, speed, width, height);
		damage = damageIn;
	}
	
	public double getDamage() {
		return damage;
	}

}
